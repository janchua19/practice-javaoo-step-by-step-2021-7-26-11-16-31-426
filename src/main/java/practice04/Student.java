package practice04;

public class Student extends Person{

    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
    public String introduce(){
        return "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Student. I am at Class " + klass + ".";
    }

    public int getKlass() {
        return klass;
    }
}
