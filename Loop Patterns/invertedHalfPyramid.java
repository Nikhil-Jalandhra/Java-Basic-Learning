public class invertedHalfPyramid {
    public static void main(String[] args) {
        // Print the pattern of Hollow rectangle
        //                     * 
        //                   * * 
        //                 * * * 
        //               * * * *
        //             * * * * *

        // Inverte in 180

        int a = 5;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
