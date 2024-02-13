import java.util.Scanner;

public class recursionFibonacci {
   
    public static void main(String[] args) {

        // Using Recursion of Print Fibonacci Series;
        
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter any number this function return fibonacci series till n");
            int a = sc.nextInt() ;
            System.out.print(0 + " ");
            System.out.print(1 + " ");
            fibonacciSeries(0, 1 , a-2);

    }
}

    public static void fibonacciSeries(int a , int b, int n){
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.err.print(c + " ");
        fibonacciSeries(b, c, n-1);
    }

}
