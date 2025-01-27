public class recursionPremutation {
    
    public static void question(String str, String permutation){
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            question(newStr, permutation + currChar );
        }

     }


    public static void main(String[] args) {

        //  This funcition print all the premutation of a string
        
        String str = "ABC";
        question(str, "");
    }

}

        // questioin("ABC", "") 
        // ├── questioin("BC", "A") 
        // │   ├── questioin("C", "AB") 
        // │   │   ├── questioin("", "ABC")  → Print "ABC"
        // │   │
        // │   └── questioin("B", "AC") 
        // │       ├── questioin("", "ACB") → Print "ACB"
        // │
        // ├── questioin("AC", "B") 
        // │   ├── questioin("C", "BA") 
        // │   │   ├── questioin("", "BAC") → Print "BAC"
        // │   │
        // │   └── questioin("A", "BC") 
        // │       ├── questioin("", "BCA") → Print "BCA"
        // │
        // └── questioin("AB", "C") 
        //     ├── questioin("B", "CA") 
        //     │   ├── questioin("", "CAB") → Print "CAB"
        //     │
        //     └── questioin("A", "CB") 
        //         ├── questioin("", "CBA") → Print "CBA"