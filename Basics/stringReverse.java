public class stringReverse {
    
    public static void main(String[] args) {

            //  First Method for String Reverse

        StringBuilder myName = new StringBuilder("NikhilJalandhra");

        for (int i = 0; i < myName.length() / 2; i++) {
            
            int front = i;
            int back = myName.length() - 1 - i;
            
            char frontChar = myName.charAt(front);
            char backChar = myName.charAt(back);

            myName.setCharAt(front, backChar);
            myName.setCharAt(back, frontChar);

        }
        System.out.println("First  String is:>   " +myName);


        //   Second Method for String Reverse
        
        StringBuilder secondName = new StringBuilder("Puneet");
        
        secondName.reverse();

        System.out.println("Second String is:>   " +secondName);


    }    
}
