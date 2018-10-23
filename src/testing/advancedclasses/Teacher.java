package testing.advancedclasses;

/**
 * Teacher.java - 
 * 
 * @author Ethan Pottinger
 * @since 22-Oct-2018
 */
public class Teacher extends Person {
    
    public Student[] students;
    private int count;
    private final int MAX_STUDENTS;

    public Teacher(String name) {
        super();
        super.setName(name);
        super.age = 30;
        MAX_STUDENTS = 100;
        count = 0;
        students = new Student[MAX_STUDENTS];
    }
    
    public void addStudent(Student student) {
        students[count] = student;
        count++;
        if(count > MAX_STUDENTS) count = 0;
    }

    @Override
    public String toString() {
        String text = super.toString();
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null) { 
                text += "\n\tStudent " + i + ": " + students[i].toString();
            }
        }
        return text;
    }
   
    public boolean equals(Teacher teacher) {
        boolean result = true;
        if(!super.equals(teacher)) result = false;
        for (int i = 0; i < 10; i++) {
            if(this.students[i] == null && teacher.students[i] != null) {
                result = false;
            }
            else if(this.students[i] != null && teacher.students[i] == null) {
            
            }
            else if(this.students[i] != null) {
                if(!this.students[i].equals(teacher.students[i])) {
                    result = false;
                }
            }
        }
        return result;
    }
    
    @Override
    public Teacher clone() {
        Teacher teacher = new Teacher(this.getName());
        teacher.age = this.age;
        teacher.isMale = this.isMale;
        for (int i = 0; i < this.students.length; i++) {
            if(this.students[i] != null) {
                teacher.addStudent(this.students[i].clone());
            }
        }
        return teacher;
    }

}
