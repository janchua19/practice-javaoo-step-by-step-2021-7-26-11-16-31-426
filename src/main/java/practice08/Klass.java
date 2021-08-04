package practice08;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private Integer number;
    private Student leader;
    List<Student> stud = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student leader) {
        if(stud != null && stud.contains(getLeader())) {
            this.leader = leader;
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        stud = new ArrayList<>();
        stud.add(student);
    }
}
