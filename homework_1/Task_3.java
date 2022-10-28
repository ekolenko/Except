/*3.Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, 
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя. */


package homework_1;

public class Task_3 {

    public static void main(String[] args) {

        System.out.println(diffArray(new int[4], new int[5]));
        
    }

    private static int[] diffArray(int[] a, int[] b) {

        if (a.length != b.length) throw new RuntimeException("Длины массивов не равны!");
        else {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                
                c[i] = a[i] - b[i];

            }

            return c;
        }
        
    }
    
}
