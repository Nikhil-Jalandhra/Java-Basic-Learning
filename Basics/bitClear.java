public class bitClear {
    public static void main(String[] args) {

        // To clear bit from specific position

        int checkNumber = 5;
        int checkPosition = 0;
        int bitMask = 1<<checkPosition;

        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & checkNumber;

        System.out.println("After clearing the number = " + newNumber);
    }

}
