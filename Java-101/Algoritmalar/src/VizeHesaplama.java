import java.util.Scanner;

public class VizeHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize Notu:");
        int vizeNotu = scanner.nextInt();
        System.out.print("Final Notu:");
        int finalNotu = scanner.nextInt();

        float ortalama = (vizeNotu * 04.f) + (finalNotu * 0.6f);
        if (ortalama >= 50 && finalNotu >= 50) {
            System.out.println("Tebrikler,geçtiniz");
        } else {
            System.out.println("Üzgünüm,kaldınız");
        }
    }
}
