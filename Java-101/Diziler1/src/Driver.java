import java.lang.reflect.Array;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
     /*   int[] numbers;
        numbers = new int[16];
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[5]);

        numbers[5] = 32;
        System.out.println(numbers[5]);
        */
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //0 dan başladığı için 6. elemandır
        System.out.println(numbers[5]);

        System.out.println(numbers.length);

        String[] names = new String[10];
        System.out.println(Arrays.toString(names));

        names[2] = "Ali";
        System.out.println(Arrays.toString(names));

        names[4] = "Hasan";
        System.out.println(Arrays.toString(names));

        names[14] = "Veli"; //hata fırlatır 14 yok


    }
}