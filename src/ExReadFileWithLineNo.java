import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;
//Question 7 : Write a program to accept a filename and print the contents of the file along with the line numbers. Also catch the required exceptions
public class ExReadFileWithLineNo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try{
            System.out.println("Enter a File name to read : ");
            String fileName = scanner.nextLine();
            String absolutePath = Paths.get(".").toAbsolutePath().toString() + "/src/";
            File iFile = new File(absolutePath + fileName);
            if (!iFile.exists()) {
                throw new FileNotFoundException("File With the name " + fileName + "not found");
            }
            String line;
            int lineNo = 1;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(iFile));

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(lineNo++ + " : " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
