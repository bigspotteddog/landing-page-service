## Branch logic

### `if`, `else if`, `else`

An `if` statement evaluates a condition, as we saw in the logic operators lesson. `If` the condition for the `if` statement is true, its code block will execute. Combined with `else if` and `else` a set of conditions can be evaluated, from top to bottom, resulting in one of the statement blocks being executed. As soon as one of the `if` statement conditions evaluates to true, its code block will execute and none of the other `if` statement conditions will be checked.


Examples

```java
int score = 83;

if (score == 100 && score >= 90) {
    
    System.out.println("You got an 'A'");

} else if (score < 90 && score >= 80) {
    
    System.out.println("You got a 'B'");

} else if (score < 80 && score >= 70) {
    
    System.out.println("You got a 'C'");

} else if (score < 70 && score >= 60) {
    
    System.out.println("You got a 'D'");

} else {
    
    System.out.println("You got a 'F'");
}
```

### `switch`

A `switch` statement is similar to an `if-else` statement however it can execute multiple `case` statement blocks if the `case` statement is met. Using a `break` statement will stop evaluation.

Example

```java
int month = 5; // June
String season = null;

switch (month) {
    case 11: // December
    case 0:  // January
    case 1:  // February
        season = "Winter";
        break;
    case 2:  // March
    case 3:  // April
    case 4:  // May
        season = "Spring";
        break;
    case 5:  // June
    case 6:  // July
    case 7:  // August
        season = "Summer";
        break;
    case 8:  // September
    case 9:  // October
    case 10: // November
        season = "Fall";
        break;
    default:
        // This should not happen and it is just
        // here to show the default case.
        season = "Unknown";
}
System.out.println(season);
```