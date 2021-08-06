package practice10;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private Klass klass;
    private LinkedList<Klass> klasses;
    private Klass klasses1;

    public Teacher(int id, String name, int age, Klass klasses1) {
        super(id, name, age);
        this.klasses1 = klasses1;
        klasses1.addTeachers(this);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {

        return klasses;
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

        if(klasses != null) {
            message += " I teach Class ";

            for(Klass klass : klasses)
            {
                int i;
                message += klass.getNumber();
                if(klass != klasses.getLast()){
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
        return klasses.contains(student.getKlass());
    }

    public String introduceWith(Student student) {
        String message = super.introduce() + " I am a Teacher.";
        List<Klass> newKlasses = new LinkedList<>();

        newKlasses = klasses.stream().filter(klass -> klass.getNumber() == student.getKlass().getNumber()).collect(Collectors.toList());

        if(!newKlasses.isEmpty()) {
            message += " I teach " + student.getName() + ".";
        }
        else {
            message += " I don't teach " + student.getName() + ".";
        }

        return message;
    }

    public void notifyTeacher(Klass klass, Student leader) {

    }
}
