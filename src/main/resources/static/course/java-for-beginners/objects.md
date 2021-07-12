## Objects

### Creating a new instance

To create a new instance of a class use the `new` keyword.

This example create a file object that represents the file `sample.txt` in the current directory.

```java
File file = new File("sample.txt");
```

`sample.txt` is passed into the `File` constructor that creates a File object from a String filename.

### Calling functions on another object

To call a function on another object from the current class we are coding use a `.` and the function name you want to call.

The nice thing about using an IDE for Java development is the IDE will show you what functions a class has once you put a `.` after the variable that is holding the instance of that class, such as the variable `file` below.

Suppose we have a file that wants to find out if the file `sample.txt` exists.

```java
File file = new File("sample.txt");

if (file.exists()) {
    System.out.println("The file exists");
}
```

### Object equality

To check if instance of objects are equal, we need to use the `.equals` function. Using the `==` operator will return whether or not the two objects are the same exact instance using its memory identifier.

For example, 

```java
String a = new String("hello"); // creates a new String instance
String b = new String("hello"); // creates another new String instance

System.out.println(a == b); // = false
```

The `.equals` function is what we use to see if two objects are equal even if they are not the same exact instance.

```java
String a = new String("hello"); // creates a new String instance
String b = new String("hello"); // creates another new String instance

System.out.println(a.equals(b)); // = true
```

### Variable scopes

#### Class scope

Any variable defined within the class `{}` is visible to anything within an instance of the class.

Example

```java
public class VariableInClassScope {
    // This variable is visible to anything within
    // these same brackets.
    private String name;

    public VariableInClassScope() {
        // This is visible within a constructor.
        name = "my name";
    }

    public String getName() {
        // This is visible within a function.
        return name;
    }

    private void printNameTenTimes() {
        for (int i = 0; i < 10; i++) {
            // This is visible within a loop.
            System.out.println(name);
        }
    }
}
```

#### Function scope

Any variable defined within the function `{}` is visible to anything within that function.

Example

```java
public class VariableInClassScope {
    public void print() {
        // name is not visible here.
        System.out.println(name);
    }

    private void printNameTenTimes() {
        // This is visible to anything within these
        // same brackets.
        String name = "my name";

        for (int i = 0; i < 10; i++) {
            // name is visible within this loop.
            System.out.println(name);
        }
    }
}
```

#### Loop scope

Any variable defined in the for loop, it configuration and within its brackets is visible to anything within its brackets.

Example

```java
public class VariableInClassScope {
    private void printZeroToTen() {
        for (int i = 0; i < 10; i++) {
            int j = i + 1;
            // i is visible here.
            System.out.println(i);
            // j is visible here.
            System.out.println(j);
        }
        // i is not visible here.
        System.out.println(i);
        // j is not visible here.
        System.out.println(j);
    }
}
```

#### Bracket scope

Any variable defined within the brackets of a code block is visible to anything within its brackets.

```java
public class BracketScope {
  public static void main(String[] args) {
    {
      String letters = "abcdefg";
  
      if (letters.length() > 0) {
          // letters is visible here.
          char[] chars = letters.toCharArray();
      }
    }
  }
}
```
