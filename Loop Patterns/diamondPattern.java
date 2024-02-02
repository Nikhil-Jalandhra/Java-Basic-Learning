public class diamondPattern {
    public static void main(String[] args) {
        //  Print the pattern Diamond
        //        * 
        //       * * 
        //      * * * 
        //     * * * * 
        //    * * * * *
        //     * * * * 
        //      * * * 
        //       * * 
        //        * 

        int a = 5;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.err.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }

        for (int i = a-1; i >= 1; i--) {
            for (int j = 1; j <= a-i; j++) {
                System.err.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }


       
    }
}
