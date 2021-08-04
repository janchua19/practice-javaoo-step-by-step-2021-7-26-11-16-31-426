package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private Student leader;
    private int number;
    List<Student> student = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student leader) {
        if(student != null && student.contains(getLeader())) {
            this.leader = leader;
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }
}
