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
        
        Student jeffMoore = new Student(21, "Jeff Moore", true, 21);
        Student janko = new Student(22, "Janko Jones", true, 22);
        
        System.out.println(jeffMoore.toString());
        System.out.println(janko.toString());
        
        Student bob = jeffMoore.clone();
        
        System.out.println(bob.toString());
        
        if(jeffMoore.equals(bob)) System.out.println("=====");
        if(!janko.equals(bob)) System.out.println("!========");
        
        Teacher wachs = new Teacher("Mr. Wachs");
        wachs.addStudent(greg);
        wachs.addStudent(rodrick);
        wachs.addStudent(jeffMoore);
        wachs.addStudent(janko);
        wachs.addStudent(bob);
        System.out.println(wachs.toString());
        System.out.println("end");
        
        checkStatus(person);
        System.out.println("\n");
        checkStatus(greg);
        System.out.println("\n");
        checkStatus(object1);
        System.out.println("\n");
        checkStatus(wachs);
        System.out.println("\n");
        
        char[] word = {'w', 'o', 'r', 'd'};
        
        String string = new String(word);
        checkStatus(word);
        
        System.out.println(Student.totalStudents);
        Student.endOfTheWorld();
    }

    private void checkStatus(Object object) {
        
        
        
        if(object instanceof Student) System.out.println("Have a student");
        
        else if(object instanceof Teacher) System.out.println("Have a teacher");
        
        else if(object instanceof String) System.out.println("Have a string");
        
        else if(object instanceof Person) System.out.println("Have a person");
        
        else System.out.println("What the fuck?");
        
    }
    
    
    
    
    
}
