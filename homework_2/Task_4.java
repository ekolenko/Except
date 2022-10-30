/* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */


package homework_2;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {
        
        try {
            System.out.printf("Введённая строка --> %s%n", inpuString());
        }
        catch (RuntimeException e) {
            System.out.println("Нельзя вводить пустые строки");
        }
    }

    public static String inpuString() {

        System.out.print("Введите строку --> ");
        Scanner console = new Scanner(System.in);

        String str = console.nextLine();

        console.close();

        if (str.isEmpty()) 
            throw new RuntimeException("Пустая строка!");
        else 
            return str;
    }
}
