package structure.array;

/**
 * Created by Lucas Ma Date:2018/4/25
 */
public class Student {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("data.structure.array.Student(name :%s, score: %d)", name, score);
    }

    public static void main(String[] args) {
        Array<Student> arr = new Array<>();
        arr.addLast(new Student("alice",100));
        arr.addLast(new Student("bob",93));
        arr.addLast(new Student("lucas",58));

        System.out.println(arr);
    }
}
