## Variables

Java is a strongly typed language and it provides built-in primitive types to use as building blocks to create other types. As an object oriented language an unlimited number of reference types are possible and Java has several useful reference types built-in.

### Primitive Types

Primitive types represent the basic building blocks needed to create other classes. The primitive types are listed below and we will experiment with each to describe them.

  * int
  * long
  * double
  * float
  * boolean
  * byte
  * short
  * char

#### int

For whole numbers, the default type is integer

```java
// whole numbers default to type integer
Object o = 5;
String classname = o.getClass().getName(); // = Integer
int min = Integer.MIN_VALUE; // = -2147483648
int max = Integer.MAX_VALUE; // = 2147483647
```

#### long

To use numbers that can be larger or smaller than the max and min integer, use a long. To declare a `long`, use a `L` or `l` to force the number to a `long`.

```java
Object o = 5L; // either upper case L or lower case l
String classname = o.getClass().getName(); // = Long
long min = Long.MIN_VALUE;
long max = Long.MAX_VALUE;
```

Or declare a variable of type `long`

```java
long l = 5; // = 5L
```

#### double

By default, a decimal number is assigned the type `double`.

```java
// Decimal numbers default to type double
Object o = 5.2;
String classname = o.getClass().getName(); // = Double
double min = Double.MIN_VALUE; // = 4.9E-324
double max = Double.MAX_VALUE; // = 1.7976931348623157E308
```

You can create a double by declaring it as a `double`

```java
double d = 5.2; // = 5.2D
```

#### float

A float is a decimal number that has a smaller range than a double.

You can force a number to be of type float with an `F` or `f`

```java
Object o = 5f; // either upper case F or lower case f
String classname = o.getClass().getName(); // = Float
float min = Float.MIN_VALUE; // = 1.4E-45
float max = Float.MAX_VALUE; // = 3.4028235E38
```

Or, you can declare a variable of type `float`

```java
float f = 5; // = 5f
```

#### boolean

A boolean is a `true` or `false` variable type.

```java
Object o = true;
String classname = o.getClass().getName(); // = Boolean
```

You can declare a variable of type boolean

```java
boolean b = true;
```

#### byte

A `byte` is a very small integer that is the basic building block used to represent numbers, characters, and other data.

```java
byte b = 1;
Object o = b; // get b as an object so we can check it
String classname = o.getClass().getName(); // = Byte
int min = Byte.MIN_VALUE; // = -128
int max = Byte.MAX_VALUE; // = 127
```

#### short

A `short` is an integer with a smaller range than an `int`

```java
short s = 1;
Object o = s; // get s as an object so we can check it
String classname = o.getClass().getName(); // = Short
int min = Short.MIN_VALUE; // = -32768
int max = Short.MAX_VALUE; // = 32767
```

#### char

A `char` is the basic building block for a `String`

```java
// Characters - ASCII characters
char c = 'a';
Object o = c; // get c as an Object so we can check it
String classname = o.getClass().getName(); // = Character
```

You can also get a `char` as its `ASCII` value

```java
int i = 'a'; // = 97
Object o = i;
String classname = o.getClass().getName(); // = Integer
```

### Strings

`String`s are sequences of `char`acters which can be used to make words, sentences, and more.

To create a new `String` use double quotes

```java
// Strings can be created with double quotes
String hello = "hello";
```

Another way to create a new `String` (not often used)

```java
String hello = new String("hello"); // = "hello"
```

And, another way

```java
char[] chars = {'h', 'e', 'l', 'l', 'o'};
String hello = new String(chars); // = "hello"
```

To get the number of characters in a `String`

```java
//                      1
//            0123456789012
int length = "one two three".length(); // = 13
```

You can get the characters in a `String`

```java
char[] chars = "hello".toCharArray(); // = {'h', 'e', 'l', 'l', 'o'}
```

To get the latter part of a `String`

This will get the rest of the `String` starting from the fourth character

```java
//                            1
//                  0123456789012
String substring = "one two three".substring(4); // = "two three"
```

To get the middle part of a `String`

This will get from the fourth character up to but not including the seventh character

```java
//                            1
//                  0123456789012
String substring = "one two three".substring(4, 7); // = "two"
```

To find out if a `String` starts with a certain `String`

```java
boolean startsWith = "one two three".startsWith("one"); // = true
```

To find out if a `String` ends with a certain `String`

```java
boolean endsWith = "one two three".endsWith("three"); // = true
```

To replace a `String` in a `String`

```java
String replace = "one two three".replace("two", "too");
// = "one too three"
```

To split a `String` into an array of parts separated by a space

```java
String first = "one two three".split(" ")[0]); // = "one"
String second = "one two three".split(" ")[1]); // = "two"
String third = "one two three".split(" ")[2]); // = "three"
```

Or

```java
String[] parts = "one two three".split(" ");
String first = parts[0]; // = "one"
String second = parts[1]; // = "two"
String third = parts[2]; // = three
```


### Reference Types

Reference types are classes that use the build block primitive types above to create new types.

#### String (see above)

A `String` is a reference type. The `String` type was described above.

#### Date

A Java date represents a specific time with millisecond resolution.

To use the `LocalDate` class in a Java class add the `import` statement

```java
import java.time.LocalDate;
```

To get the current date, invoke the `now` function

```java
LocalDate now = LocalDate.now(); // = 2021-06-27
```

To add 30 days to the date `now`

```java
LocalDate plus30Days = now.plusDays(30); // = 2021-07-27
```

To get the month from the date `now`

```java
String month = now.getMonth().toString(); // = JUNE
```

To get the day of the week from the date `now`

```java
String day = now.getDayOfWeek().toString(); // = SUNDAY
```

To get the day of the year from the date `now`

```java
int dayOfYear = now.getDayOfYear() // = 178
```

To create a date from a `String`

```java
LocalDate parsedDate = LocalDate.parse("2021-05-29"); // = 2021-05-29
```

To format a date add date format imports

```java
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
```

Invoke the format function on our `parsedDate`

```java
String formattedDate =
    parsedDate.format(DateTimeFormatter
    .ofLocalizedDate(FormatStyle.FULL)));
    // = Saturday, May 29, 2021
```

### Arrays

An array is a sequence items of a particular type. For example, an array of integers is [1, 0, 3, 5, 6]. An array of Strings is ["one", "hello", "moon", "book"]. You can also have an array of `Object`s that will hold various types of elements.

An array of elements are declared like this:

```java
int[] myArray = {1, 4, 3, 2};
```

To declare an array of a certain size,

```java
int[] myArray = int[10]; // an array with 10 elements
```

The elements will be initialized to their default value. Zero in the case of a number.

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

### Lists

A list is a data structure that holds an ordered collection of objects. There are various types of lists built into Java (Stack, LinkedList, ArrayList, and Vector). Others are available from third-party libraries.

To me, it seems that ArrayList is most used.

To use a list import the interface class `List` and an implementation class such as `ArrayList`

```java
import java.util.ArrayList;
import java.util.List;
```

To create a list of arbitrary types don't declare a type or use Object

```java
List list = new ArrayList();
list.add(1); // an int
list.add('a'); // a char
list.add("three"); // a String
list.add(4.2f); // a float
// = [1, 'a', "three", 4.2]
```

Or

```java
List<Object> list = new ArrayList<>();
list.add(1); // an int
list.add('a'); // a char
list.add("three"); // a String
list.add(4.2f); // a float
// = [1, 'a', "three", 4.2]
```

To create a list of integers

```java
List<Integer> list = new ArrayList<>();
list.add(4);
list.add(2);
list.add(1);
list.add(3);
// = [4, 2, 1, 3]
```

To use the built-in `Collections` class to sort an array, `import` it

```java
import java.util.Collections;
```

```java
Collections.sort(list); // = [1, 2, 3, 4]
```

To get the third element in the list

```java
int i = list.get(2); // = 3
```

To find the index of the element with value 3

```java
int index = list2.indexOf(3); // = 2
```

To get the number of elements in a list

```java
int size = list.size(); // = 4
```

### Maps

A map is a data structure that holds a collection of objects as key-value pairs. There are various types of maps built into Java (HashMap, TreeMap, Hashtable, and LinkedHashMap). Others are available from third-party libraries.

To me, it seems that HashMap is most used.

To create a map with arbitrary key-value types don't specify the types

```java
Map map = new HashMap();
map.put(1, "hello");
map.put("hi", 26);
map.put(true, "yes");
// = {1=hello, hi=26, true=yes}
```

Or

```java
Map<Object, Object> map = new HashMap<>();
map.put(1, "hello");
map.put("hi", 26);
map.put(true, "yes");
// = {1=hello, hi=26, true=yes}
```

To create a map with `String` keys and `int` values

```java
Map<String, Integer> map = new HashMap<>();
map.put("Ricky", 90);
map.put("Lucy", 93);
map.put("Fred", 80);
map.put("Ethel", 91);
// = {Ethel=91, Fred=80, Lucy=93, Ricky=90}
```

To get the value for "Lucy"

```java
// gets the value for "Lucy"
int score = map.get("Lucy"); // = 93
```

To replace the value for "Ricky"

```java
map.put("Ricky", 89);
int score = map.get("Ricky"); // = 89
```

## Exercise 3: Print Variable Values

For this exercise, take our `Hello, World!` application and,

### Primitives
* Print out a variable value of each primitive type,
* Check the minimum and maximum values of type `Long` and print them out

### Strings

* Create a `String` sentence and assign it to a variable then,
  * Print out the sentence `.length()`,
  * Replace the third word in the sentence with a different word and print out the sentence,
  * `Split` the sentence into an array of its words,
  * Print out the array of words,
  * Print out the fourth word in the sentence

### Dates

* Create a new `Date` and assign it to a variable that represents right `now`,
  * Print out the date variable,
  * Get the month for the date variable

### Lists

* Create an `ArrayList` variable of type `Integer`,
  * Add 5 numbers to the list in random order,
  * Use the `Collections` class to sort the list,
  * Print out the list to see the new sorted order

### Maps

* Create a Map with `String` keys and `String` values,
  * Add names as keys and addresses as values to create an address book,
  * Print out the map to see the address book,
  * Print out the `.size()` of the map to see how many addresses are in the book,
  * Get an address for one of the names in the map,
  * Print out the address
