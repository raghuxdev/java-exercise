import java.util.Scanner;
//Question 2: Write a program to count the numbers of characters entered through stdin. The program exits upon entering Ctrl+Z.
public class ExNumberOfChars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        while(sc.hasNextLine()){
            String input=sc.nextLine();
            count+=input.length();
        }
        sc.close();
        System.out.println(count);
    }
}

