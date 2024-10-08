//Question no 4 : Program to print Fibonacci series of a number using recursion. Get the number through command line argument. Throw proper errors for wrong inputs
public class ExFibonacci {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java src/ExFibonacci.java <number>");
            System.exit(1);
        }

        try {
            int n = Integer.parseInt(args[0]);
            if (n < 0) {
                throw new IllegalArgumentException("Error: Input should be a non-negative integer");
            }
            printFibonacciSeries(n);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input must be an integer !");
            System.exit(1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }

    public static void printFibonacciSeries(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }


    public static int fibonacci(int n){
        if(n==1){
            return 1;
        }
        if (n==0) {
            return 0;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
