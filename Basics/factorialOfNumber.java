import java.util.Scanner;

public class factorialOfNumber {

    public static void num(int n){
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args){
        
        try(Scanner sc = new Scanner(System.in)){

            System.err.println("Enter any number to get factorial");
            int a = sc.nextInt();
            num(a);
        }
        }
    }