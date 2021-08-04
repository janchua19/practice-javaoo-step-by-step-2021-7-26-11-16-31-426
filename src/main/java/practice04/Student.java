package practice04;

public class Student extends Person{

    private int klass;
    private String name;
    private int age;
    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
    public String introduce(){
        return "My name is " + name + ". I am " + age + " years old. I am a Student. I am at Class " + klass + ".";
    }

    public int getKlass() {
        return klass;
    }
}
