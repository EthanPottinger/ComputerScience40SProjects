package assignments.recursion.reversestring;

import globalmethods.GlobalMethods;

/**
 *
 * @author e.pottinger
 */
public class ReverseString {
    
    public static void main(String[] args) {
        String input = GlobalMethods.inputString("Welcome to the reverse program!\n" +
                "You input a string, and we reverse it!", "title");
        GlobalMethods.output(reverse(input));
        GlobalMethods.output("Thanks for using the reverse program!");
    }
    
    /**
     * This takes a string and reverses it
     * 
     * @param string the string to reverse
     * @return the reversed string
     */
    public static String reverse(String string) {
        return reverse(string, string.length() - 1);
    }
    private static String reverse(String string, int current) {
        
        if(current == 0) return Character.toString(string.charAt(current));
        
        else return string.charAt(current) + reverse(string, current - 1);
    }
    
}
