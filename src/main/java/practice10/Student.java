package practice10;

public class Student extends Person{
    Klass klass;
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        String message = super.introduce() + " I am a Student.";
        if(!this.equals(klass.getLeader())){

            return message + " I am at Class " + klass.getNumber() + ".";
        }
        else
            return message + " I am Leader of Class " + klass.getNumber() + ".";
    }
}
