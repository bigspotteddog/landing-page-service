# Java for Beginners

## Introduction

This introduction is meant to be a quick start for those new to Java.

## How to install Java 11

To start, we will install Java 11 so we can compile and execute Java applications.

1. Check for Java 11

    Open a terminal window and run this command:

    ```text
    $ java -version
    ```

    If Java is installed, you should see something that indicates the Java version installed, like this:

    ```text
    $ java -version

    openjdk version "11.0.10" 2021-01-19
    OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.10+9)
    OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.10+9, mixed mode)
    ```

    If Java version 11 is already installed, skip the `Install Java 11` step below.

    Otherwise, you will see something that indicates that Java is not installed, like this:

    ```text
    $ java -version

    No Java runtime present, requesting install.    
    ```

1. Install Java 11

    1. Open your browser and open https://adoptopenjdk.net/

    1. Choose version: `OpenJDK 11 (LTS)`

    1. Choose JVM: `HotSpot`

    1. Download the latest release

    1. Open the downloaded package and follow the prompts to install Java 11

## How to install Visual Studio Code

Visual Studio Code is a code editor we can use to edit our Java class files.

1. Install Visual Studio Code

    1. Open your web browser and open https://code.visualstudio.com/

    1. Download the build for your operating system

    1. Extract the archive in the folder of your choice

    1. Copy to your applications folder or leave it where it is

    1. Launch Visual Studio Code by running the extracted application

1. Add command line launcher

    1. Open the command pallete `Cmd + Shift + P`

    1. Search for `code`

    1. Select `Shell Command: install 'code' command in PATH`

1. Add the Java extension pack to VS Code

    1. Open the Extensions view. You can do this several ways. One way is to open the command palette `Cmd + Shift + P`, then search for `install extensions`.

    1. Search for the Java Extension Pack in the marketplace

    1. Click the install button to install Java support

## Hello, World!

Let's make a very small Java application.

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

1. Open Visual Studio Code and create a file named `HelloWorld.java` with the content above.

1. Open a terminal window in the folder you saved the `HelloWorld.java` source file.

1. Compile the Java `source` file into a Java `class` file

    ```bash
    $ javac HelloWorld.java
    ```

1. Run the Java class file

    ```bash
    $ java HelloWorld
    Hello, World!
    ```

## Anatomy of a Java class

* packages

  A `package` declaration allows you to orgainize your Java classes into a folder-like structure which become folders on your hard-drive. Java classes are typically grouped into packages by behavior. The package declaration in a class is optional. If omitted, the Java class is in the `default` package.

* imports

  An `import` statement allows you to include another Java class from outside of the package of `this` Java class.

* class declaration

  A `class` declaration defines the Java class by giving it a name and possibly defining `interface`s the Java class implements and/or a Java class it `extends`.
 
* constructors

  A Java class `constructor` defines the `parameter`s that are required for a Java class `instance` to be created.

* functions and methods

  Java class `function`s and methods define blocks of code that may receive inputs and may produce an output. A `function` and a method are both declared with the `function` keyword. The only difference being a naming convention where `function`s return a value whereas methods do not.

### A Java class example

```java
// this is a comment

// this is a package declaration
package com.fullstackclouddeveloper.tutorial;

// this imports the GsonBuilder class from the
// com.google.gson package
import com.google.gson.GsonBuilder;

// This a class declaration. The source file must be saved in
// the package folder structure and have the filename that
// matches the class name plus the file extension .java
public class MyFirstJavaApplication {

    // this is a String variable for an instance of this
    // class
    private String name;

    // this is the main method entrypoint for this application
    public static final void main(String[] args) {
        // get the name passed in as a program argument
        // on the command line
        String name = args[0];

        // get a new instance of this application
        // passing in the name from above
        MyFirstJavaApplication app =
            new MyFirstJavaApplication(name);

        // print out a message to the console
        app.print();

        // print out this instance as JSON
        app.printAsJson();
    }

    // this is a class constructor and that take in a
    // String argument for a name
    public MyFirstJavaApplication(String name) {
        // this saves the name to the instance variable
        // name
        this.name = name;
    }

    // this is a private function that returns a String
    // message
    private String getMessage(String name) {
        // this creates a String message
        return "Hello, " + name + "!";
    }

    // this is a method that prints a message to the
    // console
    private void print() {
        // this gets the message passing in the name
        String message = getMessage(name);

        // this prints the message to the console
        System.out.println(message);
    }

    // this method prints out this class instance as
    // a JSON String
    private void printAsJson() {
        System.out.println(new GsonBuilder()
          .setPrettyPrinting()
          .create()
          .toJson(this));
    }
}
```

## Functions

Java class `function`s and methods define blocks of code that may receive inputs as parameters and may return an output. A `function` and a method are both declared with the `function` keyword. The only difference being a naming convention where `function`s return a value and methods do not.

* calling functions in this class

    To call a function in this class, simply call it by function name or you can use the `this` keyword

    ```java
    String message = getMessage(name);
    ```

    or

    ```java
    String message = this.getMessage(name);
    ```

* calling functions in another class

    To call a function in an instance of another class use the instance variable followed by a `.` then the function name

    ```java
    Another other = new Another();
    String message = other.getMessage(name);
    ```

  ## Running a Java Application

  ### compiling a Java source file

    ```bash
    $ javac HelloWorld.java
    ```

  ### running a Java class

    ```bash
    $ java HelloWorld
    Hello, World!
    ```

  ### compiling a Java source file with a classpath

    If your Java application uses external library jar files, you must include them on the classpath to compile the source file

    ```bash
    $ javac -cp .:jar-file1.jar:jar-file2.jar HelloWorld.java
    ```

  ### running a Java source file with a classpath

    If your Java application uses external library jar files, you must include them on the classpath to run the class

    ```bash
    $ java -cp .:jar-file1.jar:jar-file2.jar HelloWorld
    ```

## Variables

### primitive types

  Java is a strongly typed language and it provides primitive types built into the language

  * int
  * long
  * double
  * float
  * boolean
  * byte
  * short
  * char

  ```java
  public class PrimitiveTypes {
      public static void main(String[] args) {
          // whole numbers default to type integer
          Object a = 5;
          System.out.println(a.getClass().getName());// Integer
          System.out.println(Integer.MIN_VALUE); // -2147483648
          System.out.println(Integer.MAX_VALUE); // 2147483647

          // Long - greater than max integer or less than min integer
          Object b = 5L; // either upper case L or lower case l
          System.out.println(b.getClass().getName()); // Long
          System.out.println(Long.MIN_VALUE); // -9223372036854775808
          System.out.println(Long.MAX_VALUE); // 9223372036854775807

          // decimal numbers default to type double
          Object c = 5.2;
          System.out.println(c.getClass().getName()); // Double
          System.out.println(Double.MIN_VALUE); // 4.9E-324
          System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308

          // Float - you can force a decimal number to be a float
          Object d = 5f; // either upper case F or lower case f
          System.out.println(d.getClass().getName()); // Float
          System.out.println(Float.MIN_VALUE); // 1.4E-45
          System.out.println(Float.MAX_VALUE); // 3.4028235E38

          // Boolean - true or false
          Object e = true;
          System.out.println(e.getClass().getName()); // Boolean

          // Byte - smallest value
          Object f = (byte) 1;
          System.out.println(f.getClass().getName()); // Byte
          System.out.println(Byte.MIN_VALUE); // -128
          System.out.println(Byte.MAX_VALUE); // 127

          // Short - smaller than an integer
          Object g = (short) 1;
          System.out.println(g.getClass().getName()); // Short
          System.out.println(Short.MIN_VALUE); // -32768
          System.out.println(Short.MAX_VALUE); // 32767

          // Characters - ASCII characters
          Object h = 'a';
          System.out.println(h.getClass().getName()); // Character
          System.out.println((int) 'a'); // 97
          Object i = (char) 97;
          System.out.println(i.getClass().getName()); // Character
      }
  }  
  ```

### Strings

  Strings are sequences of characters which can be used to make words, sentences, and more.

  ```java
    public class HelloWorld {
        public static void main(String[] args) {
            // Strings can be created with double quotes
            String hello = "hello";
            System.out.println(hello); // hello

            // they can also be create with the new keyword
            // but no one does that
            String hello2 = new String("hello2");
            System.out.println(hello2); // hello2

            // Strings also have methods for various operations
            // Here are a few examples

            // length - how many characters
            System.out.println("one two three".length()); // 13

            // substring - start at n and get the rest
            System.out.println("one two three".substring(4)); // "two three"

            // substring - start at n and stop at m
            System.out.println("one two three".substring(4, 7)); // "two"

            // startsWith
            System.out.println("one two three".startsWith("one")); // true

            // endsWith
            System.out.println("one two three".endsWith("three")); // true

            // replace
            System.out.println("one two three".replace("two", "too"));
            // "one too three"

            // split - create strings split by a string of characters
            System.out.println("one two three".split(" ")[0]); // "one"
            System.out.println("one two three".split(" ")[1]); // "two"
            System.out.println("one two three".split(" ")[2]); // "three"
        }
    }
  ```

### reference types

#### String (see above)

The String type was described above.

#### Date

A Java date represents a specific time with millisecond resolution.

  ```java
    import java.time.LocalDate;
    import java.time.format.DateTimeFormatter;
    import java.time.format.FormatStyle;

    public class HelloWorld {
        public static void main(String[] args) {
            // now
            LocalDate now = LocalDate.now();
            System.out.println(now); // 2021-06-27

            // add days
            LocalDate plus30Days = now.plusDays(30);
            System.out.println(plus30Days); // 2021-07-27

            // get attributes
            System.out.println(now.getMonth().toString()); // JUNE
            System.out.println(now.getDayOfWeek().toString()); // SUNDAY
            System.out.println(now.getDayOfYear()); // 178

            // create specific date from String
            LocalDate date = LocalDate.parse("2021-05-29");
            System.out.println(date); //2021-05-29

            // format date
            System.out.println(
                date.format(
                    DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
                    //Saturday, May 29, 2021
        }
    }    
  ```

#### Arrays

An array is a sequence items of a particular type. For example, an array of integers is [1, 0, 3, 5, 6]. An array of Strings is ["one", "hello", "moon", "book"]. You can also have an array of `Object`s that will hold various types of elements.

An array of elements are declared like this:

```java
int[] myArray = {1, 4, 3, 2};
```

To declare an array of a certain size,

```java
int[] myArray = int[10]; // an array with 10 elements
```

the elements will be initialized to their default value. Zero in the case of a number.

```java
int first = myArray[0]; // = 0
```

To get the number of elements in an array,

```java
int length = myArray.length; // = 4
```

To get the value of an element in an array, retrieve by its index. Array indexes start at zero. For example,

```java
       // index: 0  1  2  3
int[] myArray = {2, 5, 3, 8};

int first = myArray[0]; // = 2
int second = myArray[1]; // = 5
int third = myArray[2]; // = 3
int fourth = myArray[3]; // = 8
```

To assign an element in an array,

```java
myArray[2] = 7;
int third = myArray[2]; // = 7
```

To add two element in an array together,

```java
int sum = myArray[0] + myArray[1]; // = 7
```

#### Lists

A list is a data structure that holds an ordered collection of objects. There are various types of lists built into Java (Stack, LinkedList, ArrayList, and Vector). Others are available from third-party libraries.

To me, it seems that ArrayList is most used.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // creates a list that will hold items of type Object by default
        List list = new ArrayList();
        list.add(1);
        list.add('a');
        list.add("three");
        list.add(4.2f);
        System.out.println(list); // [1, a, three, 4.2]

        // creates a list that will hold items of type Integer
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(2);
        list2.add(1);
        list2.add(3);
        System.out.println(list2); // [4, 2, 3, 1]

        // this will sort the list in natural order of its elements
        Collections.sort(list2);
        System.out.println(list2); // [1, 2, 3, 4]

        // this will get the 3rd element in the list
        int i = list2.get(2);
        System.out.println(i); // 3

        // this will find the index of the element that is 3
        int index = list2.indexOf(3);
        System.out.println(index); // 2

        // this will get the number of elements in the list
        int size = list2.size();
        System.out.println(size); // 4
    }
}
```

#### Maps

A map is a data structure that holds a collection of objects as key-value pairs. There are various types of maps built into Java (HashMap, TreeMap, Hashtable, and LinkedHashMap). Others are available from third-party libraries.

To me, it seems that HashMap is most used.

```java
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // creates a map that will host keys and values of
        // type Object by default
        Map map = new HashMap();
        map.put(1, "hello");
        map.put("hi", 26);
        map.put(true, "yes");
        System.out.println(map);

        // creates a map with String keys and Integer values
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Ricky", 90);
        map2.put("Lucy", 93);
        map2.put("Fred", 80);
        map2.put("Ethel", 91);
        System.out.println(map2);

        // gets the value for "Lucy"
        int score = map2.get("Lucy");
        System.out.println(score); // = 93

        // replaces the value for "Ricky"
        map2.put("Ricky", 89);
        int score2 = map2.get("Ricky");
        System.out.println(score2); // = 89
    }
}
```

## Simple Math

### arithmatic operators

#### Addition

  ```java
  int sum = 2 + 3; // = 5
  ```

#### Subtraction

  ```java
  int difference = 5 - 3; // = 2
  ```

#### Multiplication

  ```java
  int product = 5 * 3; // = 15
  ```

#### Division

  ```java
  int quotient = 15 / 3; // = 5
  ```

For decimal answers, you will want to use float or double instead of int which will only store the whole number.

  ```java
  int quotient = 17 / 3; // = 5
  ```

  ```java
  double quotient = 17 / 3; // = 
  ```

#### Modulo

  ```java
  int remainder = 17 % 3; // = 2
  ```

#### Operator Precedence

### Math class
  * documentation
  * most used

## Assignment operators

* =
* +=
* -=
* \*=
* /=
* %=

## Logic Operators

* ==
* !=
* <, <=
* \>, \>=
* &&
* ||

## Branch logic

### if, else if, else
### switch

## Loops

### for loops
### while loops
### iterators

## Objects

### creating a new instance
### calling functions on another object
### object equality
### variable scope
### function scope
