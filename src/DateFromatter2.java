import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateFromatter2 {
    public static void main(String[] args) throws ParseException {
        String entrada = "Thu Feb 23 00:00:00 UTC 2017";
        String compare = "null";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd hh:mm:ss z yyyy", Locale.ENGLISH);
        Date date1 = simpleDateFormat.parse(entrada);
        Date date2 = simpleDateFormat.parse(compare);

        String resultado = date1.compareTo(date2) > 0 ? "Feito" : null;
        System.out.println(resultado);

    }
}
