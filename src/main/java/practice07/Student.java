package practice07;

public class Student extends Person{
    Klass klass;
    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        return "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Student. I am at Class " + klass.getNumber() + ".";
    }
}
