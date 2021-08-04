package practice08;

public class Student extends Person{
    Klass klass;
    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        String message = super.introduce() + " I am a Student.";
        return message + " I am at Class " + klass.getNumber() + ".";
    }
}
