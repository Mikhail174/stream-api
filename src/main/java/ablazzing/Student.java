package ablazzing;

public class Student {
    private int height;

    public Student(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "height=" + height +
                '}';
    }
}
