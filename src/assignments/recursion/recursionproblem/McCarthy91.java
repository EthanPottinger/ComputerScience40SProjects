package assignments.recursion.recursionproblem;

/**
 *
 * @author e.pottinger
 */
public class McCarthy91 {
    
    public static void main(String[] args) {
        for(int i = 0; i <= 300; i += 20) {
            System.out.println("number = " + i +"      McCarthy91 value = " + mcCarthy91(i));
        }
    }
    
    //You told me not to comment
    public static int mcCarthy91(int n) {
        if(n == 0) return 0;
        
        else if(n <= 100) return mcCarthy91(mcCarthy91(n + 11));
        
        else return (n - 10);
    }
    
}
