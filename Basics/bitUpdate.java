public class bitUpdate {
    public static void main(String[] args) {
        
        // To update bit from specific position

        int checkNumber = 5;
        // 0101
        // 0100
        // 1011
        int checkPosition = 2;

        int bitMask = 1<<checkPosition;

        int newNumber = checkNumber | bitMask;

        System.out.println("Your new number is: " + newNumber);

    }
}
