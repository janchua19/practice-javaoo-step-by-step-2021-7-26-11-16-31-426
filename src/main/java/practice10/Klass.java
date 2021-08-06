package practice10;

public class Klass {
    private int number;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }

    public void assignLeader(Student leader) {
        System.out.print("It is not one of us.\n");
    }

    public Student getLeader() {
        return null;
    }
}
