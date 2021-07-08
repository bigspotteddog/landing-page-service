import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class HelloWorld {
  public static void main(String[] args) {
    // Get today.
    LocalDate today = LocalDate.now();
    System.out.println("Today is: " + today);

    // Get the current month.
    Month currentMonth = today.getMonth();

    // Get the first day of the month.
    LocalDate day = today.withDayOfMonth(1);

    // Print the days of the week at the top of
    // the calendar.
    String[] daysOfWeek = { "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" };
    for (int i = 0; i < daysOfWeek.length; i++) {
      if (i > 0 && i < daysOfWeek.length) {
        System.out.print(' ');
      }
      System.out.print(daysOfWeek[i]);
    }
    System.out.println();

    // Print spacesuntil we are at the current day of
    // the week.
    int dayOfWeek = day.getDayOfWeek().getValue();
    for (int i = 0; i < dayOfWeek; i++) {
      System.out.print("   ");
    }

    // While we are still in this month...
    while (currentMonth.equals(day.getMonth())) {
      // Get the day of the month for this day.
      int dayOfMonth = day.getDayOfMonth();

      // If the day number is less than 10, print
      // a space to line up the days.
      if (dayOfMonth < 10) {
        System.out.print(' ');
      }

      // Print the day of the month.
      System.out.print(dayOfMonth);

      if (!day.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
        // Print a space between days.
        System.out.print(' ');
      }

      // If we are on Saturday, the last day of the week,
      // go to the next line.
      if (day.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
        System.out.println();
      }

      // Move to the next day.
      day = day.plusDays(1);
    }
  }
}