package testing.advancedclasses;

/**
 * Meeting.java - 
 * 
 * @author Ethan Pottinger
 * @since 31-Oct-2018
 */
public class Meeting {
    
    private Person[] members;
    private int count;
    private final int MAX;

    public Meeting() {
        count = 0;
        MAX = 500;
        members = new Person[MAX];
    }
    
    public void attends(Person person) {
        members[count] = person;
        count++;
        if(count > MAX) count = 0;
    }
    
    public void hold() {
        System.out.println("whats up, warning, there are " + Student.totalStudents + " Students here today");        
        
        //Enhanced for-loop
        for (Person member : members) {
            //"for every member in members"
            if(member != null) {
                member.talk();
                if(member instanceof MrWachs) System.out.println("SILENCE PLEBIANS");
            }
            
        }
        
        System.out.println("smell ya later");
    }

    @Override
    public String toString() {
        return "Meeting " + super.toString();
    }
   
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public Meeting clone() {
        return this;
    }

}
