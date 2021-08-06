package practice09;

import practice08.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person{
    //private int classes;
    List<Object> classes = new ArrayList<>();
    private LinkedList<Klass> klasses;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public String introduce(){
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
            return message += ".";
        }
            return message + " I teach No Class.";
    }

    public LinkedList<Klass> getClasses() {
        return klasses;
    }

    public void setKlasses(LinkedList<Klass> klasses) {
        this.klasses = klasses;
    }

    public LinkedList<Klass> getKlasses() {
        return klasses;
    }
}
