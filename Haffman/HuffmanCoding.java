import java.io.*;
import java.util.*;

public class HuffmanCoding {

    // Вложенный класс для узла дерева Хаффмана
    private static class Node {
        Byte value; // Символ (байт)
        int freq;   // Частота
        Node left;
        Node right;

        public Node(Byte value, int freq) {
            this.value = value;
            this.freq = freq;
            this.left = null;
            this.right = null;
        }

        public int getFreq() {
            return freq;
        }
    }

    /**
     * Рекурсивно генерирует коды Хаффмана, обходя дерево.
     * @param root Корень текущего поддерева.
     * @param code Текущий битовый путь от корня.
     * @param huffmanCodes Карта для хранения финальных кодов.
     */
    public static void generateCodes(Node root, List<Boolean> code, Map<Byte, List<Boolean>> huffmanCodes) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            // Если код пустой (случай с одним символом), добавляем false
            if (code.isEmpty()) {
                code.add(false);
            }
            huffmanCodes.put(root.value, new ArrayList<>(code));
        } else {
            code.add(false);
            generateCodes(root.left, code, huffmanCodes);
            code.remove(code.size() - 1);

            code.add(true);
            generateCodes(root.right, code, huffmanCodes);
            code.remove(code.size() - 1);
        }
    }

    /**
     * Строит дерево Хаффмана на основе карты частот.
     */
    public static Node buildHuffmanTree(Map<Byte, Integer> frequencyMap) {
        System.out.println("Построение дерева Хаффмана.");
        PriorityQueue<Node> nodes = new PriorityQueue<>(Comparator.comparingInt(Node::getFreq));

        for (Map.Entry<Byte, Integer> entry : frequencyMap.entrySet()) {
            nodes.offer(new Node(entry.getKey(), entry.getValue()));
        }

        while (nodes.size() > 1) {
            Node minNode1 = nodes.poll();
            Node minNode2 = nodes.poll();

            Node merged = new Node(null, minNode1.freq + minNode2.freq);
            merged.left = minNode1;
            merged.right = minNode2;

            nodes.offer(merged);
        }

        return nodes.poll();
    }

    /**
     * Кодирует массив байтов, используя коды Хаффмана.
     */
    public static List<Boolean> huffmanEncode(byte[] data, Map<Byte, List<Boolean>> huffmanCodes) {
        List<Boolean> encodedData = new ArrayList<>(data.length * 8);
        for (byte b : data) {
            List<Boolean> code = huffmanCodes.get(b);
            if (code != null) {
                encodedData.addAll(code);
            }
        }
        return encodedData;
    }

    /**
     * Декодирует битовую последовательность в массив байтов.
     */
    public static byte[] huffmanDecode(List<Boolean> encodedData, Map<Byte, List<Boolean>> huffmanCodes) {
        System.out.println("Декодирование данных.");

        // Создаем обратную карту для быстрого поиска символа по коду
        Map<List<Boolean>, Byte> reverseHuffmanCodes = new HashMap<>();
        for (Map.Entry<Byte, List<Boolean>> entry : huffmanCodes.entrySet()) {
            reverseHuffmanCodes.put(entry.getValue(), entry.getKey());
        }

        List<Byte> outputList = new ArrayList<>();
        List<Boolean> currentCode = new ArrayList<>();

        // Обход закодированных битов и поиск совпадений в обратной карте
        for (Boolean bit : encodedData) {
            currentCode.add(bit);
            Byte decodedByte = reverseHuffmanCodes.get(currentCode);
            if (decodedByte != null) {
                outputList.add(decodedByte);
                currentCode.clear();
            }
        }

        // Преобразование списка байтов в массив
        byte[] outputArray = new byte[outputList.size()];
        for (int i = 0; i < outputList.size(); i++) {
            outputArray[i] = outputList.get(i);
        }

        return outputArray;
    }

    /**
     * Читает входной файл, кодирует его и записывает результат в выходной файл.
     */
    public static void readAndCompress(String inputFile, String outputFile) {
        System.out.println("Начало кодирования");
        System.out.println("Входной файл: " + inputFile);
        System.out.println("Выходной файл: " + outputFile);
        
        File file = new File(inputFile);
        if (!file.exists()) {
            System.err.println("Ошибка: Входной файл не найден.");
            return;
        }

        byte[] data = new byte[(int) file.length()];

        // 1. Чтение данных
        try (FileInputStream fis = new FileInputStream(file)) {
            fis.read(data);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            return;
        }
        System.out.println("Чтение данных завершено.");

        // 2. Расчет частот и построение дерева/кодов
        Map<Byte, Integer> frequencyMap = new HashMap<>();
        for (byte b : data) {
            frequencyMap.put(b, frequencyMap.getOrDefault(b, 0) + 1);
        }

        Node huffmanTree = buildHuffmanTree(frequencyMap);

        Map<Byte, List<Boolean>> huffmanCodes = new HashMap<>();
        generateCodes(huffmanTree, new ArrayList<>(), huffmanCodes);
        System.out.println("Генерация кодов Хаффмана завершена.");

        // 3. Кодирование
        List<Boolean> encodedData = huffmanEncode(data, huffmanCodes);
        
        // 4. Запись в файл
        System.out.println("Запись закодированных данных и словаря в файл.");
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(outputFile))) {
            
            // Преобразование закодированных битов в массив байтов для записи
            byte[] encodedByteArray = new byte[(encodedData.size() + 7) / 8];
            for (int i = 0; i < encodedData.size(); i++) {
                if (encodedData.get(i)) {
                    encodedByteArray[i / 8] |= (1 << (7 - (i % 8)));
                }
            }
            
            // Записываем длину данных и сами данные
            dos.writeInt(encodedData.size()); // Длина данных в битах (4 байта)
            dos.write(encodedByteArray);    // Закодированные данные
            
            // Записываем таблицу Huffman-кодов (Словарь)
            for (Map.Entry<Byte, List<Boolean>> entry : huffmanCodes.entrySet()) {
                List<Boolean> tempCode = entry.getValue();
                
                // Преобразование кода Хаффмана (List<Boolean>) в массив байтов
                byte[] codeByteArray = new byte[(tempCode.size() + 7) / 8];
                for (int i = 0; i < tempCode.size(); i++) {
                    if (tempCode.get(i)) {
                        codeByteArray[i / 8] |= (1 << (7 - (i % 8)));
                    }
                }
                
                dos.writeByte(entry.getKey());      // Символ (1 байт)
                dos.writeByte(tempCode.size());     // Длина кода в битах (1 байт)
                dos.write(codeByteArray);           // Код (N байтов)
            }
            System.out.println("Запись завершена. Сжатый размер: " + dos.size() + " байт.");
        } catch (IOException e) {
            System.err.println("Критическая ошибка при записи в файл: " + e.getMessage());
            return;
        }
        System.out.println("Кодирование завершено");
    }

    /**
     * Читает закодированный файл, декодирует его и записывает результат в выходной файл.
     */
    public static void readAndDecompressToFile(String inputFile, String outputFile) {
        System.out.println("Начало декодирования");
        System.out.println("Входной файл: " + inputFile);
        System.out.println("Выходной файл: " + outputFile);
        
        List<Boolean> encodedData = new ArrayList<>();
        Map<Byte, List<Boolean>> huffmanCodes = new HashMap<>();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(inputFile))) {
            
            // 1. Чтение длины и закодированных данных
            int encodedLength = dis.readInt();
            byte[] dataByteArray = new byte[(encodedLength + 7) / 8];
            dis.readFully(dataByteArray);
            System.out.println("Чтение закодированных данных завершено.");

            // Преобразование байтов обратно в List<Boolean>
            for (byte b : dataByteArray) {
                for (int i = 7; i >= 0; i--) {
                    encodedData.add(((b >> i) & 1) == 1);
                }
            }
            encodedData = encodedData.subList(0, encodedLength); // Обрезаем лишние биты

            // 2. Чтение таблицы Huffman-кодов (Словаря)
            System.out.println("Чтение словаря Хаффмана.");
            while (dis.available() > 0) {
                byte key = dis.readByte();
                int codeLength = dis.readByte();
                byte[] codeByteArray = new byte[(codeLength + 7) / 8];
                dis.readFully(codeByteArray);

                // Преобразование байтов кода обратно в List<Boolean>
                List<Boolean> huffmanCode = new ArrayList<>();
                for (byte b : codeByteArray) {
                    for (int i = 7; i >= 0; i--) {
                        huffmanCode.add(((b >> i) & 1) == 1);
                    }
                }
                huffmanCode = huffmanCode.subList(0, codeLength);
                huffmanCodes.put(key, huffmanCode);
            }

            // 3. Декодирование
            byte[] decodedData = huffmanDecode(encodedData, huffmanCodes);

            // 4. Запись декодированных данных в выходной файл
            System.out.println("Запись декодированных данных в выходной файл.");
            try (FileOutputStream fos = new FileOutputStream(outputFile)) {
                fos.write(decodedData);
            } catch (IOException e) {
                System.err.println("Ошибка при записи в файл: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Критическая ошибка при чтении файла: " + e.getMessage());
            return;
        }
        System.out.println("Декодирование завершено");
    }

    /**
     * Главный метод для обработки аргументов командной строки.
     */
    public static void main(String[] args) {
        String inputFile = "";
        String outputFile = "";
        boolean decode = false;
        boolean inputSet = false;
        boolean outputSet = false;

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-i":
                case "--input":
                    if (i + 1 < args.length) {
                        inputFile = args[++i];
                        inputSet = true;
                    } else {
                        System.err.println("Ошибка: Не указано имя входного файла.");
                    }
                    break;
                case "-o":
                case "--output":
                    if (i + 1 < args.length) {
                        outputFile = args[++i];
                        outputSet = true;
                    } else {
                        System.err.println("Ошибка: Не указано имя выходного файла.");
                    }
                    break;
                case "-d":
                case "--decode":
                    decode = true;
                    break;
                default:
                    System.err.println("Неизвестный аргумент: " + args[i]);
                    break;
            }
        }

        // Проверка наличия обязательных аргументов
        if (!inputSet || !outputSet) {
            System.out.println("\nИспользование:");
            System.out.println("Кодирование: java HuffmanCoding -i <входной_файл> -o <выходной_файл>");
            System.out.println("Декодирование: java HuffmanCoding -d -i <входной_файл> -o <выходной_файл>");
            return;
        }
        
        if (decode) {
            readAndDecompressToFile(inputFile, outputFile);
        } else {
            readAndCompress(inputFile, outputFile);
        }
    }
}