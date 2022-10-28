/*4.* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя. 
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.*/


package homework_1;

public class Task_4 {

    public static void main(String[] args) {

        System.out.println(diffArray(new int[5], new int[5]));
        
    }

    private static float[] diffArray(int[] a, int[] b) {

        if (a.length != b.length) 
            throw new RuntimeException("Длины массивов не равны!");
        else {
            float[] c = new float[a.length];
            for (int i = 0; i < a.length; i++) {
                
                if (b[i] == 0) 
                    throw new RuntimeException("Деление на 0!");
                else
                    c[i] = a[i] / b[i];

            }

            return c;
        }
        
    }
    
}
