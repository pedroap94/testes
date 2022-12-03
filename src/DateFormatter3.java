import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter3 {
    public static final String FORMAT0_DATA = "yyyy-MM-dd HH:mm:ss";
    public static void main(String[] args) throws ParseException {
        String dataEntrada = "2021-10-18 09:00:00";
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT0_DATA);
        Date data = dateFormat.parse(dataEntrada);

        System.out.println(dateFormat.format(data));
    }
}
