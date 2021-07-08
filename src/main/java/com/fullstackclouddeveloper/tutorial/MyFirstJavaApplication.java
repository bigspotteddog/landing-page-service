// this is the package for our class
package com.fullstackclouddeveloper.tutorial;

// this imports the GsonBuilder class from the
// com.google.gson package
import com.google.gson.GsonBuilder;

// this a class declaration
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
        MyFirstJavaApplication app = new MyFirstJavaApplication(name);

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
        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(this));
    }
}
