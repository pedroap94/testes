import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateVerify {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date2 = simpleDateFormat.parse("2022-01-01");
        if (date2.compareTo(date) <= 0){
            System.out.println("ok");
        } else {
            System.out.println("Failed");
        }
    }
}
