public class recursionCharOuccer {

    public static int firstOucc = -1;
    public static int lastOucc = -1;

    public static void charOuccer(String str, int index) {
        if (index == str.length()) {
            System.out.println("First occurrence of 'a': " + (firstOucc + 1));
            System.out.println("Last occurrence of 'a': " + (lastOucc + 1));
            return;
        }
        
        if (str.charAt(index) == 'a') {
            if (firstOucc == -1) {
                firstOucc = index;
            }
            lastOucc = index;
        }
        charOuccer(str, index+1);
    }

    public static void main(String[] args) {
        String str = "abcadghalyaz";
        charOuccer(str, 0);
    }
}
