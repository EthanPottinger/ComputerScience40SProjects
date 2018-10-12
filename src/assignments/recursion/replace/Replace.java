package assignments.recursion.replace;

import globalmethods.GlobalMethods;
import javax.swing.JOptionPane;
/**
 *
 * @author e.pottinger
 */
public class Replace {
    
    public static void main(String[] args) {
        
        boolean using = true;
        do {
        String text = GlobalMethods.inputString("Welcome to the reverse program\n\n"
                + "What string did you want to change", "Replace");
        char from = GlobalMethods.inputChar("What character do you want to change?");
        char to = GlobalMethods.inputChar("What did you want to change that character to?");
        String newText = replace(text, from, to);
        GlobalMethods.output(newText);
        int yesNo = JOptionPane.showConfirmDialog(null, "Thank you for using the replace program"
                + "\n\nWould you like to use it again?", "Replace",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(yesNo == 0) using = true;
        else if(yesNo == 1) using = false;
        }
        while(using == true);
        GlobalMethods.output("Thank you for using the replace program");
    }
    
    /**
     * This will take a string and replace one character in that string to a different letter
     * 
     * @param text the string to change
     * @param from the character to change
     * @param to what to change from to
     * @return the replaced string
     */
    public static String replace(String text, char from, char to) {
        return replace(text, from, to, 0);
    }
    private static String replace(String text, char from, char to, int place) {
        if(place == text.length() - 1 && text.charAt(place) == from) return Character.toString(to);
        
        else if(place == text.length() - 1) return Character.toString(text.charAt(place));
        
        else if(text.charAt(place) == from) return Character.toString(to) + replace(text, from, to, place + 1);
        
        else return text.charAt(place) + replace(text, from, to, place + 1);
        
    }
    
}
