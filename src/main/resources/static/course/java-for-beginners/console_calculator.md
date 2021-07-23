## Exercise 7: Console Calculator

For this exercise, we are going to use what we learned to create a new program that is a console calculator. It will support the basic operations, addition, subtraction, multiplication, and division. You can add whatever other functionality you would like.

The user should be able to enter a calculation like this,

```
4
+
5
9.0
*
2
18.0
Q
```

For this exercise, we will need to get user input from the console, or terminal window. That is not something I do very often so I have to look it up. Part of programming is learning how to find out how to implement something to solve a problem. For this problem we need to look up, `java console input` and hopefully that will get us useful results.

That lookup got some good results but the first hits were for getting a single input. We want many inputs until the user is done so we need to modify our search to `java console input in a loop`.

I typically go for answers from stackoverflow and the first answer led me to this implementation that uses the `Scanner` class.

To look up the `Scanner` class, search for `java 11 scanner` which should find the official documentation as the first hit:

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html

```java
// The `try` block will automatically close the input reader when
// we are done.
try (Scanner scanner = new Scanner(System.in)) {
    // Loop until the user quits.
    while (true) {
        // Read a line from the console.
        String line = scanner.nextLine();
        
        // some other code

        if ("Q".equals(line)) {
            break; // exit the loop
        }
    }
}
```

Using this input code above, create a new class with a main method that implements the calculator.

Watch the video for our implementation to see if your solution is similar.