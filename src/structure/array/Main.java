package structure.array;

public class Main {

    public static void main(String[] args) {

        Array<Integer> arr = new Array<>();
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);
        arr.add(1,100);
        arr.addLast(100);
        System.out.println(arr);

        arr.remove(1);
        System.out.println(arr);
        arr.remove(4);
        arr.remove(5);
        arr.remove(3);
        boolean res = arr.removed(100);
        System.out.println(arr);
        System.out.println(res);

    }
}
