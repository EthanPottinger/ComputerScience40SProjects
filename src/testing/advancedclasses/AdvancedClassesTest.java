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
        Person.endOfTheWorld();
        
        Phantom phantom = new Phantom(14, "Danny Phantom", true);
        Poltergeist geist = new Poltergeist(50, "Geist Fieri", true);
        Haunted haunted = new Haunted();
        Husky husky = new Husky(17, "Sweaty Thai", false, 6969);
        MrWachs mrWachs = new MrWachs("MrWachs");
        phantom.talk();
        geist.talk();
        System.out.println(haunted.toString());
        husky.talk();
        mrWachs.talk();
        
        Meeting meeting = new Meeting();
        meeting.attends(person);
        meeting.attends(geist);
        meeting.attends(greg);
        meeting.attends(jeffMoore);
        meeting.attends(phantom);
        meeting.attends(mrWachs);
        meeting.attends(husky);
        meeting.hold();
        
//        Prilosec prilosec = new Prilosec();
//        Wanton wanton = new Wanton();
//        IceCream iceCream = new IceCream();
//        Spaghetti spaghetti = new Spaghetti();
//        Nerds nerds = new Nerds();
//        geist.consume(prilosec);
//        phantom.consume(iceCream);
//        mrWachs.consume(wanton);
//        husky.consume(spaghetti);
//        jeffMoore.consume(nerds);
//        jeffMoore.consume(new Prilosec());

        Athlete zihen = new Athlete(17, "Zihen Googuo", true, 0);
        zihen.setPlayer("Crusher99");
        zihen.setOpponent("N00bStomper");
        zihen.playerFight(10);
        zihen.opponentFight(9);
        zihen.results();
        zihen.play(1, 3);
        zihen.end(1);
        
        int x = 69;
        
        output(person);
        output(zihen);
        output(mrWachs);
        output(new String("Yeet"));
        output(x);
        
        Box<Poltergeist> box1 = new Box<>();
        Box<Athlete> box2 = new Box<>();
        Box<MrWachs> box3 = new Box<>();
        box1.wrap(geist);
        box2.wrap(zihen);
        box3.wrap(mrWachs);
        box1.peek();
        box2.peek();
        box3.peek();
        
        Character letter = new Character('T');
        Person[] people = {geist, phantom, mrWachs};
        
        Home house = new Home(person, people);
        house.visit();
        
    }

    private void checkStatus(Object object) {
        
        if(object instanceof Student) System.out.println("Have a student");
        
        else if(object instanceof Teacher) System.out.println("Have a teacher");
        
        else if(object instanceof String) System.out.println("Have a string");
        
        else if(object instanceof Person) System.out.println("Have a person");
        
        else System.out.println("What the fork?");
        
    }

    private static <T> void output(T item) {
        String text = "Class " + item.getClass().getSimpleName() + " As a String = " + item.toString();
        System.out.println(text);
    }
    
    
    
    
    
}
