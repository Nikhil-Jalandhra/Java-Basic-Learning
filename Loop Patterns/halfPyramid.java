public class halfPyramid {
    public static void main(String[] args) {
        // Print the pattern of Hollow rectangle
        //             * 
        //             * * 
        //             * * * 
        //             * * * *
        //             * * * * *
        int a = 5;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print the pattern of Inverted Hollow rectangle
        //             * * * * *
        //             * * * *
        //             * * * 
        //             * * 
        //             * 

        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
