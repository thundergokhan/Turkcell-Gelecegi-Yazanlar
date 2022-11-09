import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        boolean sonuc = 9 != 9;

        System.out.print(sonuc);


        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        System.out.print(str1.equals(str2));
    }
}