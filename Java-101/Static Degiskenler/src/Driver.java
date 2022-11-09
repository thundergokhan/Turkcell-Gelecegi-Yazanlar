import static java.lang.Math.PI;

public class Driver {
    static int i;

    static {
        i = 20;
    }

    public static void main(String[] args) {
        System.out.println(i);
        //  Driver.i = 20;
        //    System.out.println(Driver.i);

        System.out.println(Math.PI);
    }
}