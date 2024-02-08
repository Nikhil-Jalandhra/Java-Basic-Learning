import java.util.Scanner;

public class fibonaciSeries {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

    //    Print the fibonacci series 

    //    0 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987

    System.out.println("Enter nth Numbe or Fibonacci series "); 
    int x = sc.nextInt();
    
    int a = 0;
    int b = 1;
    int c = 0;
    
    System.out.print(a + " ");
    
    for (int i = 1; i < x ; i++) {

        c = a + b;
        System.out.print(c + " " );
        a = b;
        b = c;

        }

        System.out.println("...");
        System.out.println("Done.");
    }
    }
}
