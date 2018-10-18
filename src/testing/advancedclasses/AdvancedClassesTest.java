package testing.advancedclasses;

/**
 *
 * @author e.pottinger
 */
public class AdvancedClassesTest {
    
    public AdvancedClassesTest() {
        System.out.println("start");
        
        Person person = new Person();
        Person secondPerson = new Person();
        
        person.talk();
        
        secondPerson.talk();
        
        Student greg = new Student(100);
        Student rodrick = new Student(58);
        
        greg.talk();
        rodrick.talk();
        
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = object1;
        System.out.println(object1.toString());
        System.out.println(object2.toString());
        System.out.println(object3.toString());
        
        if(object1.equals(object3)) {
            System.out.println("==");
        }
        else {
            System.out.println("!=");
        }
        
        System.out.println("end");
    }
    
}
