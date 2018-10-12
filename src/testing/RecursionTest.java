package testing;

import numbers.Calculator;

/**
 *
 * @author e.pottinger
 */
public class RecursionTest {
    public RecursionTest() {
        System.out.println("Recursion test started");
        
        int max = 143;
        int min = -10;
        
        for(int base = min; base <= max; base++) {
            for(int exp = min; exp <= max; exp++) {
                System.out.println(base + "^" + exp + " = " + Calculator.power(base, exp));
            }
        }
        
        System.out.println("Recursion test complete");
    }
}
