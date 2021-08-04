package practice09;

import practice08.Student;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    //private int classes;
    List<Klass> classes = new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        String message = super.introduce() + " I am a Teacher.";
        if(!classes.isEmpty())
            return message + " I teach Class ";
        else
            return message + " I teach No Class.";
    }
}
