package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private Student name;
    List<Student> student = new ArrayList<>();


    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }

    public void assignLeader(Student leader) {
        if(student != null && student.contains(leader))
        {
            this.leader = leader;
        }
            System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student stud) {
        student = new ArrayList<>();
        student.add(stud);
    }
}
