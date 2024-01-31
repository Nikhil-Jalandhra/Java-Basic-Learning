public class numberPyramid {
    public static void main(String[] args) {
        // Print the pattern Number Pyramid
        //          1
        //         2 2
        //        3 3 3
        //       4 4 4 4
        //      5 5 5 5 5

        int a = 5;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" ");
            }
        for (int j = 1; j <= i; j++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    }
}
