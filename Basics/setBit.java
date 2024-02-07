public class setBit {
    public static void main(String[] args) {

        //   To Set the bit of a number 

        int checkNumber = 5;
        int setPositon = 3;

        int bitMask = 1<<setPositon;

        int newNumber =  bitMask | checkNumber;

        System.out.println("New Number is: " + newNumber);
    }
}
