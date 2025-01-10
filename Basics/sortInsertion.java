public class sortInsertion {
    public static void printArray(int myarr[]){
        for (int i = 0; i < myarr.length; i++) {
            System.err.print(myarr[i] + " ");
        }
    }
    
    public static void main(String[] args) {

        // Insertion Sort

        int myarr[] = {8, 5, 7, 1, 4, 3, 2, 9, 6};

        for (int i = 1; i < myarr.length ; i++) {
            int current = myarr[i];
            int j = i-1;
            while (j >= 0 && current < myarr[j]) {
                myarr[j+1] = myarr[j];
                j--;
            }
            myarr[j+1] = current;
        }
        printArray(myarr);
    }
}
