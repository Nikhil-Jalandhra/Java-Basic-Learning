public class recursionSubsequences {

    public static boolean[] alphabets  = new boolean[26];

    public static void printSubsequences(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char current = str.charAt(index);
        printSubsequences(str, index+1, newString+current);
        printSubsequences(str, index+1, newString);

        // -----------This is how function is work-----------

        // Current Character 'a'
        // printSubsequences(str, 0+1, "" + 'a');
        // printSubsequences(str, 0+1, "");

        
        
        //  printSubsequences(str, 1, "" + 'a'); Calls
        // Current Character 'b'
        // printSubsequences(str, 1, "ab'); Calls
        // printSubsequences(str, 1, "a"); Calls
        
        // printSubsequences(str, 1, ""); Calls
        // Current Character 'b'
        // printSubsequences(str, 1, "b"); Calls
        // printSubsequences(str, 1, ""); Calls
        
        // -----------This is the what we see in output becuase of str length-----------

        // printSubsequences(str, 2, "ab"); Calls
        // Current Character 'c'
        // printSubsequences(str, 2, "abc"); Print
        // printSubsequences(str, 2, "ab"); Print


        // printSubsequences(str, 2, "a"); Calls
        // Current Character 'c'
        // printSubsequences(str, 1, "ac"); Print
        // printSubsequences(str, 1, "a); Print


        // printSubsequences(str, 2, "b"); Calls
        // Current Character 'c'
        // printSubsequences(str, 2, "bc"); Print
        // printSubsequences(str, 2, "b"); Print
        
        // printSubsequences(str, 1, ""); Calls
        // Current Character 'c'
        // printSubsequences(str, 2, ""); Print
        // printSubsequences(str, 2, "c"); Print


        // Graphical repersentation
        
        //                    ""
        //             /              \
        //           "a"              ""
        //       /        \         /     \
        //     "ab"      "a"      "b"     ""
        //    /   \     /   \    /   \   /  \
        // "abc" "ab" "ac" "a" "bc" "b" "c" "" 

        //                 ^Output^


    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsequences(str, 0, "");

    }
}
