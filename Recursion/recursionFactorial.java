import java.util.Scanner;

public class recursionFactorial { 
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            // Factorial of n Natural Number with the help of recursion

        System.out.println("Enter any number this function return fatorial of n natural number.");

        int value = sc.nextInt();

        System.out.println("The factorial of "+ value + " natural number = " + factorial(value));
    }
}

    public static int factorial(int value){
        if (value!=1) {
            return value * factorial(value -1);
        }
        else{
            return value;
        }
    }

}
