package practice10;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private Klass klass;
    private LinkedList<Klass> linkedList;


    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        klass.addTeachers(this);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.linkedList = klasses;
        klasses.forEach(klass1 -> klass1.addTeachers(this));
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {

        return linkedList;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String message = super.introduce() + " I am a Teacher.";

        if(linkedList != null) {
            message += " I teach Class ";

            for(Klass klass : linkedList) //Delete
            {
                int i;
                message += klass.getNumber();
                if(klass != linkedList.getLast()){ //Delete
                    message += ", ";
                }
            }
            message += ".";
        }
        else {
            message += " I teach No Class.";
        }
        return message;
    }

    public boolean isTeaching(Student student) {
        return linkedList.contains(student.getKlass());
    }

    public String introduceWith(Student student) {
        String message = super.introduce() + " I am a Teacher.";
        List<Klass> newKlasses;

        newKlasses = linkedList.stream().filter(klass -> klass.getNumber() == student.getKlass().getNumber()).collect(Collectors.toList());

        if(!newKlasses.isEmpty()) {
            message += " I teach " + student.getName() + ".";
        }
        else {
            message += " I don't teach " + student.getName() + ".";
        }

        return message;
    }

    public void notifyStudentJoinClass(Klass klass, Student student)
    {
        String message = "I am " + this.getName() + ". I know " + student.getName() + " has joined Class " + klass.getNumber() + ".\n";
        System.out.print(message);
    }

    public void notifyTeacher(Klass klass, Student leader) {
        String message = "I am " + this.getName() + ". I know " + leader.getName() + " become Leader of Class " + klass.getNumber() + ".\n";
        System.out.print(message);
    }
}
