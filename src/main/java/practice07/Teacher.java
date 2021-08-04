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
}
