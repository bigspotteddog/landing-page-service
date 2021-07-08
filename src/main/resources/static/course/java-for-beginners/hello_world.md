## Hello, World!

Let's make a very small Java application. Don't worry about the specifics right now, we will learn more about that later.

HelloWorld.java
```java
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
```

The code above will print `Hello, World!` to the console window.

### How to run this Java application

To run this Java application

1. Open Visual Studio Code and create a file named `HelloWorld.java` with the content above.

1. Open a terminal window in the folder you saved the `HelloWorld.java` source file.

1. Compile the Java `source` file into a Java `class` file with this command

    ```bash
    $ javac HelloWorld.java
    ```

1. Run the Java class file with this command

    ```bash
    $ java HelloWorld
    ```

    Here is the output value

    ```bash
    Hello, World!    
    ```

We will learn more about running Java applications later.