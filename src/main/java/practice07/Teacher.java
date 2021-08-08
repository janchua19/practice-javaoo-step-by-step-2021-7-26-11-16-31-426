package practice07;

public class Teacher extends  Person{
    Klass klass;

    public Teacher(int id, String name, int age){
        super(id, name, age);
    }
    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return super.getAge();
    }

    public Klass getKlass() {
        return klass;
    }

    String message = "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Teacher.";

    public String introduce(){
        String message =  super.introduce() + " I am a Teacher.";
        if(klass != null) {
            return message + " I teach Class " + klass.getNumber() + ".";
        }
        return message + " I teach No Class.";
    }

    public String introduceWith(Student jerry) {
        String message = "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Teacher.";
        if (jerry.klass.getNumber() == klass.getNumber())
            return message + " I teach " + jerry.getName()+ ".";
        return message + " I don't teach " + jerry.getName()+ ".";
    }
}
