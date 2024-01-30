public class halfPyramidWithNumber {

    public static void main(String[] args) {
     // Print the pattern of Hollow rectangle
        //             1 
        //             1 2 
        //             1 2 3 
        //             1 2 3 4
        //             1 2 3 4 5

        int a = 5;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }   
     // Print the pattern of Hollow rectangle
     //             1 2 3 4 5
     //             1 2 3 4
     //             1 2 3 
     //             1 2 
     //             1 


        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }   
    }
}
