package practice06;

public class Teacher extends Person{
    Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        String message = "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Teacher.";
        if(klass != null){
            return message + " I teach Class " + klass.getNumber() + ".";
        }
        else
            return message + " I teach No Class.";
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduceWith(Student jerry) {
        String message = "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Teacher.";
        if (jerry.klass.getNumber() == klass.getNumber())
            return message + " I teach " + jerry.getName()+ ".";
        return message + " I don't teach " + jerry.getName()+ ".";
    }
}
