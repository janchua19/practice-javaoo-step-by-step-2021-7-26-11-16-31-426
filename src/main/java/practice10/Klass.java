package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private Student name;
    private Teacher teacherAssign;
    List<Student> student = new ArrayList<>();
    List<Teacher> teacher = new ArrayList<>();


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

        if(teacher != null){
            teacher.stream().forEach(teacherAssign -> teacherAssign.notifyTeacher(this,leader));
        }
    }

    public void addTeachers(Teacher teachers) {
        teacher = new ArrayList<>();
        teacher.add(teachers);
    }
}
