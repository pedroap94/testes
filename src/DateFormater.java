import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormater {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yy h:mm a");
        String data = sdf.format(new Date());
        System.out.println(data);
        Date dataFormatada = sdf.parse(data);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String datasaida = simpleDateFormat.format(dataFormatada);

        Date dataSaidaFormatada = simpleDateFormat.parse(datasaida);
        System.out.println(datasaida);
    }
}
