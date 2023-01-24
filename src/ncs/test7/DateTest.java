package ncs.test7;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {
    public static void main(String[] args) {
        GregorianCalendar grg = new GregorianCalendar(1987,4,27);
        System.out.println(grg.toZonedDateTime());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");

        String output = simpleDateFormat.format(grg.getTime());
        System.out.println(output);
        System.out.println(GregorianCalendar.getInstance().get(Calendar.YEAR) - grg.get(Calendar.YEAR) +"세" );
    }
}
