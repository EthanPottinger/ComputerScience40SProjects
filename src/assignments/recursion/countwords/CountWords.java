package assignments.recursion.countwords;

import globalmethods.GlobalMethods;
import javax.swing.JOptionPane;
/**
 *
 * @author e.pottinger
 */
public class CountWords {
    
    public static void main(String[] args) {
        boolean using = true;
        do {
        String text = GlobalMethods.inputString("Welcome to the count words program\n\n"
                + "What string did you want to count?", "Replace");
        int wordCount = countWords(text);
        GlobalMethods.output("You're sentence has " + wordCount + " words");
        int yesNo = JOptionPane.showConfirmDialog(null, "Thank you for using the replace program"
                + "\n\nWould you like to use it again?", "Replace",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(yesNo == 0) using = true;
        else if(yesNo == 1) using = false;
        }
        while(using == true);
        GlobalMethods.output("Thank you for using the count words program");
    }
    
    /**
     * This method takes a string and counts how many words it has
     * 
     * @param text the string to check
     * @return the amount of words
     */
    public static int countWords(String text) {
        return countWords(text, 0);
    }
    private static int countWords(String text, int place) {
        
        if(place == text.length() - 1 && text.charAt(place) != ' ') return 1;
        
        else if(place == text.length() - 1 && text.charAt(place) == ' ') return 0;
        
        else if(text.charAt(place) != ' ' && text.charAt(place + 1) == ' ') {
            return 1 + countWords(text, place + 1);
        }
        
        else return countWords(text, place + 1);
        
    }
    
}
