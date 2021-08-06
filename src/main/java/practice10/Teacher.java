package practice10;

import java.util.Collection;
import java.util.LinkedList;

public class Teacher extends Person{
    private Klass klass;
    private LinkedList<Klass> klasses;

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
        return false;
    }
}
