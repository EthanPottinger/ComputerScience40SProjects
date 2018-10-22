package testing.advancedclasses;

/**
 *
 * @author e.pottinger
 */
public class Person {
    
   private String name;
   public int age;
   protected boolean isMale;
      
   public Person() {
       name = "Jeff Moore";
       age = 0;
       isMale = true;
   }
   public Person(int age, String name, boolean isMale) {
       this.name = name;
       this.age = age;
       this.isMale = isMale; 
   }
   
   public void talk() {
       System.out.println(this.toString());
   }
   
   @Override
   public String toString() {
       return "Person: name " + name + " age " + age + " Is a male " + isMale;
   }
   
   @Override
   public boolean equals(Object object) {
       Person person = (Person)object;
       
       if(this.age != person.age) return false;
       if(this.isMale != person.isMale) return false;
       if(!this.name.equals(person.name)) return false;
       
       return true;
   }
   
   @Override
   public Person clone() {
       return new Person(age, name, isMale);
   }
   
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   
   
   
}
