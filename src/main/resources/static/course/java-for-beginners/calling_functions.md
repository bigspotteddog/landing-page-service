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
