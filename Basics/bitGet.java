public class bitGet {
    public static void main(String[] args) {

        //  To check the Bit of Number is zero or one.

        int checkNumber = 5;
        int checkPosition = 3;

        int bitMask = 1<<checkPosition;

        if ((bitMask & checkNumber) == 0) {
            System.out.println("The Number is 0");
        }else{
            System.out.println("The Number is 1");
        }
    }
}
