package practice05;

public class Teacher extends Person{
    private Integer klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }


    public int getKlass() {
        return klass;
    }

    private String message = "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Teacher.";

    public String introduce(){
        if(klass != null) {
            return message + " I teach Class " + klass + ".";
        }
        else {
            return message + " I teach No Class.";
        }
    }
}
