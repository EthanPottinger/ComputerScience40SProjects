package testing.advancedclasses;

/**
 *
 * @author e.pottinger
 */
public class Student extends Person {

    private int studentNumber;
    
    public Student(int StudentNumber) {
        super();
        this.studentNumber = StudentNumber;
        this.isMale = true;
    }
    
    @Override
    public void talk() {
        super.talk();
        System.out.println("\tStudent #" + studentNumber);
    }
    
}
