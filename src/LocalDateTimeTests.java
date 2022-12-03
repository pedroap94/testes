import java.time.DayOfWeek;
import java.time.LocalDateTime;

import static java.time.temporal.TemporalAdjusters.next;

public class LocalDateTimeTests {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().with(next(DayOfWeek.SUNDAY)).withHour(2).withMinute(00).withSecond(00));
    }
}
