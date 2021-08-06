package practice08;

public class Teacher extends Person{
    private Klass klass;
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce(){
        String message =  super.introduce() + " I am a Teacher.";
        if(klass != null) {
            return message + " I teach Class " + klass + ".";
        }
        return message + " I teach No Class.";
    }

    public String introduceWith(Student student) {
        String message = super.introduce() + " I am a Teacher.";
        if (student.klass.getNumber() == klass.getNumber()) {
            return message + " I teach " + student.getName() + ".";
        }
        return message + " I don't teach " + student.getName()+ ".";
    }

    public Klass getKlass() {
        return klass;
    }
}
