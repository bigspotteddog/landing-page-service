## Calling Functions

Java class `function`s and methods define blocks of code that may receive inputs as parameters and may return an output. A `function` and a method are both declared with the `function` keyword. The only difference being a naming convention where `function`s return a value and methods do not.

### Calling functions in this class

To call a function in this class, simply call it by function name or you can use the `this` keyword

```java
String message = getMessage(name);
```

Or

```java
String message = this.getMessage(name);
```

### Calling functions in another class

To call a function in an instance of another class use the instance variable followed by a `.` then the function name

```java
Another other = new Another();
String message = other.getMessage(name);
```

### Exercise 2: Calling functions

Create a new class named `Greeting` with a function named `hello` that returns a `String` `"Hello, World!"`

```java
public class Greeting {
    public String hello() {
        return "Hello, World!";
    }
}
```

Modify our `HelloWorld.java` application we created in the `Hello, World!` lesson to call the `Greeting` class to say `hello` instead of the `String` literal `"Hello, World!"` Don't forget to use the `new` keyword to create a new instance of `Greeting`.

Here is the `HelloWorld.java` application again in case you need to recreate it.

HelloWorld.java
```java
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
```

NOTE: One of the things I have noticed about VS Code is it is compiling our Java classes for us so they are ready to run once they are compilable.