import java.util.Scanner;

public class UI {
 
    public static void showMessage() {
        System.out.print("Введите данные пользователя латиницей через пробел в следующем формате:\n" +
                            "Фамилия Имя Отчество ДатаРождения(dd.mm.yyyy) НомерТелефона(+0123456789) Пол(m|f)\n" +
                            "--> ");
    }

    public static String getStrFromUser() {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        console.close();
        return str;
    }  
}
