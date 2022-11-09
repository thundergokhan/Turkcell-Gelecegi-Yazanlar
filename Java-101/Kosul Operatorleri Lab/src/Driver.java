import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        int x = 30;
        int y = 20;
        /*  if (x > y) {
            System.out.println("x y'den buyuktur");
        } else {
            System.out.println("x y'den kucuktur");
        } */

        //    System.out.print(x > y ? "x y den buyuktur" : "x y den kucuktur");

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.print(x > i ? "x i den büyüktür " : "x kucuktur i den");

    }
}