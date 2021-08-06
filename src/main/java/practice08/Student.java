package practice08;

public class Student extends Person{
    Klass klass;
    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce(){
        String message = super.introduce() + " I am a Student.";
        if(!this.equals(klass.getLeader())){
            return message + " I am Leader of Class " + klass.getNumber() + ".";
        }
        return message + " I am at Class " + klass.getNumber() + ".";
    }


    public Klass getKlass() {
        return klass;
    }
}
