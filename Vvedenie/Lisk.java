package Vvedenie;
class Document {
    public void save() {
    }
}

class TextDocument extends Document {
    @Override
    public void save() {
        System.out.println("Нет ошибки");
    }
}

class ReadOnlyDocument extends Document {
    @Override
    public void save() {
        throw new UnsupportedOperationException("Ошибка");
    }
}

public class Lisk{

    public void saveDocument(Document document) {
        document.save();
    }

}