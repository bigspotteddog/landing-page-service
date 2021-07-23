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

Any variable defined in the for loop, its configuration and within its brackets is visible to anything within its brackets.

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

### Inheritance (`extends`)

In Java, if a class is not declared `final` it can be extended to make a new class that adds functionality while having full access to the parent class public and protected members.

For example, if we have a class named `Mammal` we can have a class `Lion` that inherits the traits of `Mammal` and adds traits specific to `Lion`s.

```java
public class Mammal {
    private boolean hairOrFur = true;

    public boolean hasHairOrFur() {
        return hairOrFur;
    }
}
```

```java
public class Lion extends Mammal {
    public void roar() {
        System.out.println("roar");
    }
}
```

In this case, the `Lion` instance created here has access to its parent class `Mammal` `hasHairOrFur` function.

```java
public class TestInheritance {
    public static void main(String[] args) {
        Lion lion = new Lion();
        boolean hasHairOrFur = lion.hasHairOrFur(); // = true
        lion.roar();
    }
}
```

### Composition (`implements`)

`Composition` is preferred over `inheritence` for its maintainability and flexibility. `Composition` is implemented using the `implements` keyword to implement an `interface`. Where a class can only inherit from one class, a class can implement many interfaces.

This is the `Person` interface. Classes that implement this `interface` must `implement` the `getName` function.

```java
interface Person {
    String getName();
}
```

This is the `Login` interface. Classes that implement this `inteface` must implement the `getUsername` and `getPassword` functions.

```java
interface Login {
    String getUsername();
    String getPassword();
}
```

The `User` class below implements both the `Person` and `Login` interfaces.

```java
public class User implements Person, Login {
    private String name;
    private String username;
    private String password;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
```

This `UserService` is used to `authenticate` a `User` when they `login`. If the `password` is equal to the `User` `password`, the login is successful.

```java
public class UserService {
    private static Map<String, User> users = new HashMap<>();

    static {
        User user = 
            new User("Wally", "wally@gmail.com", "abcdefg");
        users.put(user.getUsername(), user);
    }

    public Login authenticate(
            String username,
            String password)
    {
        User user = users.get(username);
        if (password.equals(user.getPassword())) {
            return user;
        }
        // fail the program with a not found exception
        throw new RuntimeException("User not found");
    }
}
```

For example, if the login is successful, print the user's name.

```java
public class TestUserLogin {
    public static void main(String[] args) {
        String username = args[0];
        String password = args[1];
        Login login = UserService
            .authenticate(username, password);
        User user = (User) login;
        System.out.println("Hello, " + user.getName());
    }
}
```

### Exercise 6: Implement User Login

For this exercise, use what you have learned so far to implement the composition example classes above. Try to implement these classes without referring back to this lesson as much as possible. Pretend that there is not something to look at and you are implementing this from scratch. Let the "create a user login" purpose guide your implementation and see if it comes out the same.

The recording above includes our attempt at this exercise.