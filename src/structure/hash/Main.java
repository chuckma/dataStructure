package structure.hash;

/**
 * @Author Lucas Ma
 */
public class Main {

    public static void main(String[] args) {

        int a = 42;
        System.out.println(((Integer)a).hashCode());

        int b = -42;
        System.out.println(((Integer)b).hashCode());

        double c = 3.1415926;
        System.out.println(((Double)c).hashCode());

        String str = "immm";

        System.out.println(str.hashCode());



    }
}
