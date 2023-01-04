import java.io.FileWriter;
import java.io.IOException;

public class IO {

    public static void writeToFile(User user) throws IOException {

        var fileWriter = new FileWriter(user.getName(),true);
        fileWriter.write(user.serialyzeUser() + "\n");
        fileWriter.close();
    }
    
}
