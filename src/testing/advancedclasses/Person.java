package testing.advancedclasses;

/**
 *
 * @author e.pottinger
 */
public class Person {
    
   public String name;
   private int age;
   protected boolean isMale;
      
   public Person() {
       name = "Jeff Moore";
       age = 0;
       isMale = true;
   }
   
   public void talk() {
       System.out.println("Person " + name + " is " + age + " and maleness is " + isMale);
   }
   
}
