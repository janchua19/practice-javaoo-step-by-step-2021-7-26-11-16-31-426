package practice07;

import java.util.Objects;

public class Student extends Person{

    Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), klass);
    }

    public String introduce(){
        String message = "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Student.";
        if(!this.equals(klass.getLeader())){
            return message + " I am at Class " + klass.getNumber() + ".";
        }
        else
            return message + " I am Leader of Class " + klass.getNumber() + ".";
    }

    public Klass getKlass() {
        return klass;
    }
}
