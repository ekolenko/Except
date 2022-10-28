//1.Реализуйте 3 метода, чтобы в каждом из них получить разные исключения


package homework_1;

public class Task_1 {


    public static void main(String[] args) {

        exceptNullPointer(null);
        exceptIndexOutOfBounds(new int[10]);
        exceptStackOverflow();
        
    }

    private static int exceptNullPointer(int[] arr) {

        return arr.length;

    }

    private static int exceptIndexOutOfBounds(int[] arr) {

        return arr[arr.length];

    }

    private static void exceptStackOverflow() {

        exceptStackOverflow();

    }
    
}
