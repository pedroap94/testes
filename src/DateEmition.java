import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateEmition {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd@HH:mm:ss.SSSZ");
        sdf.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
        Date date = new Date();
        System.out.println(sdf.format(date));
    }
}
