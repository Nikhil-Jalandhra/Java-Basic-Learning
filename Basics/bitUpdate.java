import java.util.*;

public class bitUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter 0/1 to convert bit");
        int query = sc.nextInt();

        int checkNumber = 5;
        int bitPosition = 1;
        int bitMask = 1<<bitPosition;
        
        if (query == 1) {
            int newNumberWith1 = bitMask | checkNumber;
            System.out.println("Your new number is: " + newNumberWith1);
        }else if (query == 0) {
            int notBitMask = ~(bitPosition);
            int newNumberWith0 = notBitMask & checkNumber;
            System.out.println("Your new number is: " + newNumberWith0);
        }
        sc.close();

    }
}
