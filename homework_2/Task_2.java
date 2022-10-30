// Если необходимо, исправьте данный код


package homework_2;

public class Task_2 {
    

   public static void main(String[] args) {
       
       int[] intArray = new int[10];
   //    int[] intArray = new int[5];
   //    int[] intArray = null;

       try {
           int d = 0;
           double catchedRes1 = intArray[8] / d;
           System.out.println("catchedRes1 = " + catchedRes1);
       
   // Добавить ArrayIndexOutOfBoundsException и NullPointerException
           
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) { 
           System.out.println("Catching exception: " + e);
        }
        
   }
}
