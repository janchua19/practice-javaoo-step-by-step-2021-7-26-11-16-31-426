package practice06;

public class Student extends  Person{
    Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce(){
        return "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Student. I am at Class " + klass.getNumber() + ".";
    }

    public Klass getKlass() {
        return klass;
    }
}
