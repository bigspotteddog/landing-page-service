## Loops

### for loops

`for` loops provide a way to loop on a incremental or decremental basis.

Here is an incrementing example

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

output

```
0
1
2
3
4
```

Increment by 2 using an addition assignment operator

```java
for (int i = 2; i <= 8; i += 2) {
    System.out.println(i);
}    
```

output

```
2
4
6
8
```

Here is a decrementing example

```java
for (int = 5; i > 0; i--) {
    System.out.println(i);
}
```

output

```
5
4
3
2
1
```

`for` loops can also iterate through a collection of objects

```java
List<String> names = Arrays.asList("Ricky", "Lucy", "Fred", "Ethel");

for (String name : names) {
    System.out.println(name);
}
```

output

```
Ricky
Lucy
Fred
Ethel
```

Or, you can increment through the list like this

```java
List<String> names = Arrays.asList("Ricky", "Lucy", "Fred", "Ethel");

for (int i = 0; i < names.size(); i++) {
    System.out.println(i + " = " + names.get(i));
}
```

output

```
0 = Ricky
1 = Lucy
2 = Fred
3 = Ethel
```

### while loops

A `while` loop will loop the execution of its code while the condtion it evaluates is `true`.

Example

To count by 2's

```java
int i = 2;

while (i <= 8) {
    System.out.println(i);
    i += 2;
}
```

output

```
2
4
6
8
```

### iterators

An `iterator` is an object that manages iteration through a collection of objects.

Example

```java
List<String> names = Arrays.asList("Ricky", "Lucy", "Fred", "Ethel");

Iterator<String> iterator = names.iterator();

while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

output

```
Ricky
Lucy
Fred
Ethel
```

## Exercise 5: Print a calendar using loops

In this example, we will use what we have learned so far to create a calendar for the current month. We will use conditional statements, for loops and a while loop

```java
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
        // Print a space between days if not Saturday.
        // The ! means not in a conditional.
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
```

output

```
Today is: 2021-07-08
Su Mo Tu We Th Fr Sa
             1  2  3
 4  5  6  7  8  9 10
11 12 13 14 15 16 17
18 19 20 21 22 23 24
25 26 27 28 29 30 31
```