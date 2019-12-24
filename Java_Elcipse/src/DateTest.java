
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, Month.JUNE,21);
        System.out.println(date);
// MM = 01, MMM = JAN, MMMM = January, mm = 01 minutes, yyyy = year, dd = day , hh = hour
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd,yyyy");
        System.out.println(date.format(f));

    }

}
