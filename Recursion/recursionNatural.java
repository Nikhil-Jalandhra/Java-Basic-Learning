import java.util.Scanner;

public class recursionNatural {
    
public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        // Sum of n Natural Number with the help of recursion
        
        System.out.println("Enter any number this function return sum of n natural number.");
        int value = sc.nextInt();
        naturalNum(value);

        System.out.println("The sum of "+ value + " natural number = " + naturalNum(value));

    }
}

    public static int naturalNum(int value){
        if (value != 0){
            return value + (naturalNum(value - 1));
        }else{
            return value;
        }

    }
}
