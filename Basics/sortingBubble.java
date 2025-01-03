public class sortingBubble {
    public static void printArray(int myarr[]){
        for (int i = 0; i < myarr.length; i++) {
            System.err.print(myarr[i] + " ");
        }
    }
    
    public static void main(String[] args) {

        // First Sorting in Java (Bubble sort)

        int myarr[] = {8, 5, 7, 1, 4, 3, 2, 9, 6};

        for (int i = 0; i < myarr.length-1 ; i++) {
            for (int j = 0; j < myarr.length-1-i; j++) {
                if (myarr[j] > myarr[j+1]) {
                    int temp = myarr[j];
                    myarr[j] =  myarr[j+1];
                    myarr[j+1] = temp;

                }
            }
        }
        printArray(myarr);
    }
}
