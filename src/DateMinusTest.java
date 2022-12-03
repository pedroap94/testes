import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateMinusTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.minusDays(-10);
        Date date = Date.from(localDate1.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println(date);
    }

}
