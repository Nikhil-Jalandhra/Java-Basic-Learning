public class palindromicPattren {
    public static void main(String[] args) {
        //  Print the pattern Palindromic Pattren
        //              1
        //            2 1 2
        //          3 2 1 2 3
        //        4 3 2 1 2 3 4
        //      5 4 3 2 1 2 3 4 5

        int a = 5;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                 System.out.print(j+ " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
