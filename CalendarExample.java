
import java.util.Calendar;
import java.util.GregorianCalendar;

class CalendarExample {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        System.out.println("Using Calendar:");

        System.out.println("Year: " + c.get(Calendar.YEAR));
        System.out.println("Month: " + (c.get(Calendar.MONTH) + 1));
        System.out.println("Date: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour: " + c.get(Calendar.HOUR));
        System.out.println("Minute: " + c.get(Calendar.MINUTE));
        System.out.println("Second: " + c.get(Calendar.SECOND));

        GregorianCalendar g = new GregorianCalendar();

        int year = g.get(GregorianCalendar.YEAR);

        System.out.println("\nUsing GregorianCalendar:");

        if (g.isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
