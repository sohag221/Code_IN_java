
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
public class currentDay {

        public static void main(String[] args) {
            LocalDate d=LocalDate.now();
            DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String df=f.format(d);
            System.out.println(df);
            String[] day={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
            Calendar cal=Calendar.getInstance();
            int p=cal.get(Calendar.DAY_OF_WEEK);
            System.out.println(day[p-1]);


        }
    }
