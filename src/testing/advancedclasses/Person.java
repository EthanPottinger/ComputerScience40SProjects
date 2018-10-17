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
       System.out.println(this.toString());
   }
   
   @Override
   public String toString() {
       return "Person: name " + name + " age " + age + " Is a male " + isMale;
   }
   
}
