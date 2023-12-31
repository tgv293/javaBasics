import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DateUtils2 {


  public static String now(String dateFormat) {
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
    return sdf.format(cal.getTime());

  }

  public static void  main(String arg[]) {
     System.out.println(DateUtils2.now("dd MMMMM yyyy"));
     System.out.println(DateUtils2.now("yyyyMMdd"));
     System.out.println(DateUtils2.now("dd.MM.yy"));
     System.out.println(DateUtils2.now("MM/dd/yy"));
     System.out.println(DateUtils2.now("yyyy.MM.dd G 'at' hh:mm:ss z"));
     System.out.println(DateUtils2.now("EEE, MMM d, ''yy"));
     System.out.println(DateUtils2.now("h:mm a"));
     System.out.println(DateUtils2.now("H:mm:ss:SSS"));
     System.out.println(DateUtils2.now("K:mm a,z"));
     System.out.println(DateUtils2.now("yyyy.MMMMM.dd GGG hh:mm aaa"));
  }
}

