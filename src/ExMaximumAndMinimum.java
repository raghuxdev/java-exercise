import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//Question 3 : Write a program that randomly fills a 4 by 5 by 8 array, then prints the largest and smallest values in the array
public class ExMaximumAndMinimum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("For 3D Matrix of i X j X k");
        System.out.println("Enter i : ");
        int i=sc.nextInt();
        System.out.println("Enter j : ");
        int j=sc.nextInt();
        System.out.println("Enter k : ");
        int k=sc.nextInt();

        int[][][] arr=new int[i][j][k];
        fillAndFindMinAndMax(arr);

    }

    public static void fillAndFindMinAndMax(int[][][] arr){
        Random random=new Random();
        int min= Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        System.out.println("Array filled with random values : ");
        for(int i=0;i<arr.length;i++){
            System.out.print("[");
            for(int j=0;j<arr[i].length; j++){
                System.out.print("[");
                for(int k=0;k<arr[i][j].length ; k++){
                    arr[i][j][k]= random.nextInt();
                    int value= arr[i][j][k];
                    if(value < min){
                        min=value;
                    }
                    if(value>max){
                        max=value;
                    }
                    System.out.print(arr[i][j][k]);
                    if(k<arr[i][j].length-1){
                        System.out.print(",");
                    }
                }
                System.out.print("]");
                if(j<arr[i].length-1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            System.out.println();
        }
        System.out.println();
        System.out.println("Min Value : "+min+" Max Value : "+max);

    }

    public static void printArray(int[][][] arr) {
        System.out.println("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("[ ");
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]);
                    if(k<arr[i][j].length-1){
                        System.out.print(",");
                    }
                }
                System.out.print(" ]");
            }
            System.out.print("] ");
            System.out.println();
        }
        System.out.println();
    }


}
