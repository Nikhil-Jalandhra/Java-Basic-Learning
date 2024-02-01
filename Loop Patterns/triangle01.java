public class triangle01 {
    public static void main(String[] args){

        // Print the pattern 0-1 Triangle
        //        1
        //        0 1
        //        1 0 1
        //        0 1 0 1
        //        1 0 1 0 1

        int a = 5;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                int b = i+j;
                if (b % 2 == 0) {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
