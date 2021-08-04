package practice05;

public class Teacher extends Person{
    private int klass;
    private int nullKlass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    private String message = "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Teacher.";

    public String introduce(){
        if(klass == nullKlass)
        {
            return message + " I teach No Class.";
        }
            return message + " I teach Class "+klass+".";
    }
}
