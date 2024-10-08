
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
// Question 1: Get an input from the user using DataInputStream and print the same.
public class ExDataInputStream {
    public static void main(String[] args) {

        DataInputStream dataInputStream = new DataInputStream(System.in);
        BufferedReader reader=new BufferedReader(new InputStreamReader(dataInputStream));

        try{
             System.out.println(reader.readLine());
        }catch (Exception e){
           e.printStackTrace();
        }
    }

    //DataInputStream's readLine() method is depreciated
    public static void print(){
        DataInputStream dataInputStream = new DataInputStream(System.in);
        try{
            System.out.println(dataInputStream.readLine());
        }catch (IOException e){
           e.printStackTrace();
        }
    }

}
