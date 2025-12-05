package Stroki.FormatirInfo;
import java.util.Calendar;
import java.util.Locale;

public class Pract3 {
    public static void main(String[] args) {
        
        Calendar now = Calendar.getInstance();

        
        Locale ruLocale = Locale.forLanguageTag("ru-RU");

        
        // 1. %tH - Час в 24-часовом формате (00-23)
        // 2. %tM - Минуты как десятичное целое (00-59)
        String timeResult = String.format(ruLocale, 
            "1 и 2. Текущее время (ЧЧ:ММ): %tH:%tM%n", now, now);
        System.out.print(timeResult);

        // 3. %tY - Год в четырехзначном формате
        String yearResult = String.format(ruLocale, 
            "3. Год: %tY%n", now);
        System.out.print(yearResult);
        
        // 4. %tB - Полное название месяца
        String monthResult = String.format(ruLocale, 
            "4. Месяц: %tB%n", now);
        System.out.print(monthResult);
        
        // 5. %tA - Полное название дня недели
        String dayResult = String.format(ruLocale, 
            "5. День недели: %tA%n", now);
        System.out.print(dayResult);

    }
}
