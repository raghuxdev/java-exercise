import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;
//Question 6 : Write a program to perform a file copy operation using the file streams of java. Get the file names as command line parameters. Throw required errors and catch required exceptions
public class ExCopyFile {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a file name to be the copied version name : ");
        String fileName=sc.nextLine();
        FileInputStream fis=null;
        FileOutputStream fos=null;
        String workingDirectoryPath=Paths.get(".").toAbsolutePath().normalize().toString()+"/src/";
        try{
            File iFile=new File(workingDirectoryPath+"/ExCopyFile.java");
            File oFile=new File(workingDirectoryPath+fileName+".java");

            if(oFile.exists()){
                System.out.println("File with the name : "+fileName+".java already exists!");
                return;
            }
             fis=new FileInputStream(iFile);
             fos=new FileOutputStream(oFile);

            int i;

            while((i=fis.read())!=-1){
                fos.write(i);
            }
            System.out.println("Copy of a File : ExCopyFile.java is Created under a name : "+fileName+".java");

        }catch (Exception e){
           e.printStackTrace();
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }

    }
}
