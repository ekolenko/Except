/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных. */


package homework_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        System.out.println(getFloat());

    }

    public static float getFloat() {

        while (true) {

            float value;

            try {

                Scanner scanner = new Scanner(System.in);
                value = scanner.nextFloat();
                scanner.close();
                return value;

            } catch (Exception e) {

                System.out.println("Введено некорректное значение!");

            }
        }
    }
}
