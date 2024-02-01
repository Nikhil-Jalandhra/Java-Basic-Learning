public class solidRectangle {
    public static void main(String[] args) {

        // Print the pattern of solid rectangle
        //             * * * * *
        //             * * * * *
        //             * * * * *
        //             * * * * *
        //             * * * * *

        int a = 5;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
