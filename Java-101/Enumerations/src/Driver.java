import java.time.DayOfWeek;
import java.time.Month;

public class Driver {
    public static void main(String[] args) {
        Aylar ay = Aylar.OCAK;
        System.out.println(ay);
        ay = Aylar.EKIM;
        System.out.println(ay);

        Aylar[] values = Aylar.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);

        }
        Aylar valueOf = Aylar.valueOf("SUBAT");
        System.out.println(valueOf);

        DayOfWeek sunday = DayOfWeek.SUNDAY;
        System.out.println(sunday);

        DayOfWeek of = DayOfWeek.of(3);
        System.out.println(of);

        Month february = Month.FEBRUARY;
    }
}