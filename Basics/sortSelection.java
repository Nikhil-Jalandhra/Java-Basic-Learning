public class sortSelection {
    public static void printArray(int myarr[]){
        for (int i = 0; i < myarr.length; i++) {
            System.err.print(myarr[i] + " ");
        }
    }
    
    public static void main(String[] args) {

        // Selection Sort

        int myarr[] = {8, 5, 7, 1, 4, 3, 2, 9, 6};

        for (int i = 0; i < myarr.length-1 ; i++) {
            int samllest = i;
            for (int j = i+1; j < myarr.length; j++) {
                if (myarr[samllest] > myarr[j]) {
                    samllest = j;
                }
            }
            int temp = myarr[samllest];
            myarr[samllest] = myarr[i];
            myarr[i] = temp; 
        }
        printArray(myarr);
    }
}
