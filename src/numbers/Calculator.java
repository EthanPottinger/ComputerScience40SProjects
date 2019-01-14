package numbers;

/**
 *
 * @author e.pottinger
 */
public class Calculator {
    
    public static double factorial(int n) {
        //base case
        if(n <= 1) return 1;
        //recursive case
        else return n * factorial(n - 1);
    }
    public static double power(int base, int exp) {
        //base case
        if(exp == 1) return base;
        //base case 2
        else if(exp == 0) return 1;
        //recursive case
        else if(exp < 0) return 1 / power(base, Math.abs(exp));
        //recursive case 2
        else return base * power(base, exp - 1);
    }
    public static int choose(int n, int r) {
        return (int) (factorial(n) / (factorial(r) * factorial(n - r)));
    }
    
}
