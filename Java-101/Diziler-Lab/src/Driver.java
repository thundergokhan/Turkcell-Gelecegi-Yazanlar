import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
     /*   int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 20;
        numbers[3] = 30;
        numbers[4] = 40;

        System.out.println(numbers.length);  // eleman sayısı
        System.out.println(Arrays.toString(numbers)); // içeriği

        System.out.println("-------------");

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }





        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi Uzunluğu: ");
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + "Sayı:");
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        // aritmetik ortalama
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        System.out.println(total / numbers.length);
        */

        //      int total = 0;
        //        int[] numbers = {1, 5, -5, 9, 2, 8, 9};

        //       int[] numbers2 = new int[numbers.length];
        //       for (int i = 0; i < numbers.length; i++) {

        //        numbers2[i] = numbers[i];
        //          System.out.println(Arrays.toString(numbers));
        //         System.out.println(Arrays.toString(numbers2));

        //      for (int i = 0; i < numbers.length; i++) {
        //
        //          total = total + numbers[i];
        //  }
        // System.out.println(total);

        //       String[] names = new String[3];
        //     names[0] = "Ali";
        //   names[1] = "Ahmet";
        //  names[2] = "Mehmet";

        // System.out.println(Arrays.toString(names));
        // for (int i = names.length -1;  i >= 0; i--) {
        //   System.out.println(names[i]);
        // }

        //     int[] numbers1 = {1, 2, 3};
        //   System.out.println(Arrays.toString(numbers1));
        // int[] numbers2 = numbers1;
        //  System.out.println(Arrays.toString(numbers2));

        //      numbers1[0] = 5;
        //     System.out.println(Arrays.toString(numbers2));


        int[] numbers = {20, 32, 12, 46, 4};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 12));
        // Sonuç 2
        //Olmayan değer yazarsak sonuç -1

        int[] copyof = Arrays.copyOf(numbers, 3);
        System.out.println(Arrays.toString(copyof));
        int[] copyOfRange = Arrays.copyOfRange(numbers, 2, 4);
        System.out.println(Arrays.toString(copyOfRange));

        //       Arrays.fill(numbers, 44);
        //     System.out.println(Arrays.toString(numbers));

        //küçükten büyüğe sıralama
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}