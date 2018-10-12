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
        
        secondPerson.name = "Britny Bitch";
        secondPerson.talk();
        
        Student greg = new Student(100);
        Student rodrick = new Student(58);
        
        greg.talk();
        rodrick.talk();
        
        System.out.println("end");
    }
    
}
