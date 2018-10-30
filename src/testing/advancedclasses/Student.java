package testing.advancedclasses;

/**
 *
 * @author e.pottinger
 */
public class Student extends Person {

    private int studentNumber;
    public static int totalStudents;
    
    public Student(int StudentNumber) {
        super();
        this.studentNumber = StudentNumber;
        this.isMale = true;
        totalStudents++;
    }
    public Student(int age, String name, boolean isMale, int studentNumber) {
        super(age, name, isMale);
        this.studentNumber = studentNumber;
        totalStudents++;
    }
    
    @Override
    public void talk() {
        super.talk();
        System.out.println("\nStudent #" + studentNumber);
    }
    
    public int getStudentNumber() {
        return studentNumber;
    }
    
    @Override
    public boolean equals(Object object) {
        Student student = (Student)object;
        if(this.studentNumber != student.getStudentNumber()) return false;
        return super.equals(student);
    }
    
    @Override
    public Student clone() {
        return new Student(super.age, super.getName(), super.isMale, studentNumber);
    }
    
    public String toString() {
        return super.toString() + "\nstudent number: " + studentNumber;
    }
    
}