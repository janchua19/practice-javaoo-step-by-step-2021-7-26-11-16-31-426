package practice10;

import java.util.ArrayList;
import java.util.List;
import java.text.MessageFormat;

public class Klass {
    private int number;
    private Student leader;
    private Student name;
    private Teacher teacher;
    private List<Student> studentMember;
    private List<Teacher> teachers;


    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public List<Student> getMembers(){
        return studentMember;
    }

    public void setStudentMember(List<Student> studentMember) {
        this.studentMember = studentMember;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }

    public void assignLeader(Student leader) {
        if(studentMember != null && studentMember.contains(leader))
        {
            this.leader = leader;
            if(teachers != null)// Delete
            {
                teachers.forEach(teacher -> teacher.notifyTeacher(this, leader));
            }
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {

        studentMember = new ArrayList<>();
        studentMember.add(student);
        if(teachers != null)
        {
            teachers.stream().forEach(teacher -> teacher.notifyStudentJoinClass(this, student));
        }
    }

    public void addTeachers(Teacher teacher) {
        teachers = new ArrayList<>();
        teachers.add(teacher);
    }
}
