## Anatomy of a Java class

The following describes the structure of a Java class and its major parts.

* Packages

  A `package` declaration allows you to orgainize your Java classes into a folder-like structure which become folders on your hard-drive. Java classes are typically grouped into packages by behavior. The package declaration in a class is optional. If omitted, the Java class is in the `default` package.

* Imports

  An `import` statement allows you to include another Java class from outside of the package of `this` Java class.

* Class declaration

  A `class` declaration defines the Java class by giving it a name and possibly defining `interface`s the Java class implements and/or a Java class it `extends`.
 
* Constructors

  A Java class `constructor` defines the `parameter`s that are required for a Java class `instance` to be created.

* Variables

  Variables can be declared at various scopes within a Java `class`. The scopes within a Java `class`. Variables declared at the `instance` level are visible to all of the code within a running `instance` of the `class`. Variables declared within a `function` or method are visible to all of the code within that `function` or method. Variables declared within a `statement` are only visible within that `statement`.

  It is also possible to declare `class` level variables that are available to any running `instance` of a `class`.

* Functions and methods

  Java class `function`s and methods define blocks of code that may receive inputs and may produce an output. A `function` and a method are both declared with the `function` keyword. The only difference being a naming convention where `function`s return a value whereas methods do not.

### A Java class example

```java
// This is a comment

// This is a package declaration
package com.fullstackclouddeveloper.tutorial;

// This imports the GsonBuilder class from the
// com.google.gson package
import com.google.gson.GsonBuilder;

// This is a class declaration. The source file must be saved
// in the package folder structure and have the filename that
// matches the class name plus the file extension .java
public class MyFirstJavaApplication {

    // This is a String variable for an instance of this
    // class
    private String name;

    // This is the main method entrypoint for this application
    public static final void main(String[] args) {
        // Get the name passed in as a program argument
        // on the command line
        String name = args[0];

        // Get a new instance of this application
        // passing in the name from above
        MyFirstJavaApplication app =
            new MyFirstJavaApplication(name);

        // Print out a message to the console
        app.print();

        // Print out this instance as JSON
        app.printAsJson();
    }

    // This is a class constructor and that take in a
    // String argument for a name
    public MyFirstJavaApplication(String name) {
        // This saves the name to the instance variable
        // name
        this.name = name;
    }

    // This is a private function that returns a String
    // message
    private String getMessage(String name) {
        // This creates a String message
        return "Hello, " + name + "!";
    }

    // This is a method that prints a message to the
    // console
    private void print() {
        // This gets the message passing in the name
        String message = getMessage(name);

        // This prints the message to the console
        System.out.println(message);
    }

    // This method prints out this class instance as
    // a JSON String
    private void printAsJson() {
        System.out.println(new GsonBuilder()
          .setPrettyPrinting()
          .create()
          .toJson(this));
    }
}
```
