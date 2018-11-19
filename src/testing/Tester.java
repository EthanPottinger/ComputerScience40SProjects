package testing;

import testing.advancedclasses.*;
import testing.collections.*;

/**
 *
 * @author e.pottinger
 */
public class Tester {
    
    public Tester() {
        System.out.println("Testing started");
        
//        RecursionTest unit1 = new RecursionTest();
      
//        AdvancedClassesTest unit2 = new AdvancedClassesTest();
        
        CollectionsTest unit3 = new CollectionsTest();
        
        System.out.println("Testing ended");
    }
}
