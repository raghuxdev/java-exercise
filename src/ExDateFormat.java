import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
//Question 5 : Write a program to print todays date in the format Day MMM DD hr.min.sec TIMEZONE YYYY [Ex: Fri Aug 01 16:16:27 IST 2008] using date format
public class ExDateFormat {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("E MMM dd HH.mm.ss z y");
        dateFormat.setTimeZone(TimeZone.getDefault());
        String formattedDate = dateFormat.format(now);
        System.out.println(formattedDate);
    }
}
