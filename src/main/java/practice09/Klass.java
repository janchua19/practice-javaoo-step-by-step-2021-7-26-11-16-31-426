package practice09;

public class Klass {
    private Student leader;
    private int number;

    public Klass(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }
}
