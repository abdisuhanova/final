import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:/Users/User/Downloads/cars_.sql");
            FileWriter fileWriter = new FileWriter("C:/Users/User/Downloads/cars.sql");
            Scanner scanner = new Scanner(fileReader);
            String fileContent = "";
            StringBuffer stringBuffer = new StringBuffer();

            while (scanner.hasNext()) {
                stringBuffer.append(scanner.hasNext());
                stringBuffer.delete(stringBuffer.indexOf("'$"), stringBuffer.indexOf("$") - 1);
                stringBuffer.deleteCharAt(stringBuffer.lastIndexOf("'") - 1);
                fileContent = fileContent.concat(stringBuffer + "\n");
                stringBuffer.delete(0, stringBuffer.length() - 1);
            }
            fileReader.close();

            fileWriter.write(fileContent);
            fileWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Gitty proverka!");
    }
}
