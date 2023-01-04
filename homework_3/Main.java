public class Main {
    
    public static void main(String[] args) {
    
        UI.showMessage();
        String str = UI.getStrFromUser();
        try {
        User user = new User(str);
        IO.writeToFile(user);
        }
        catch (MyOwnException e) {
            System.out.printf("Некорректный ввод. %s%n",e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка.");
            e.printStackTrace();
        }    
    }
}