## Logic Operators

### `==`

The equality operator returns whether or not the value on the left is equal to the value on the right.

```java
int i = 3;
int j = 2;

boolean b = i == j; // = false
```

These types of operations are typically used in a conditional statement. We will learn more about conditional statements soon.

```java
int i = 3;
int j = 2;

if (i == j) {
  System.out.println("i is equal to j");
}
```

### `!=`

The inequality operator returns whether or not the value on the left is not equal to the value on the right.

```java
int i = 3;
int j = 2;

if (i != j) {
    System.out.println("i is not equal to j");
}
```

### `<`, `<=`

The less than and less than or equal to operators return whether the value on the left is less than or less than or equal to the value on the right.

```java
int i = 3;
int j = 2;

if (i <= j) {
    System.out.println("i is less than or equal to j");
}
```

### `>`, `>=`

The greater than and greater than or equal to operators return whether the value on the left is greater than or greater than or equal to the value on the right.

```java
int i = 3;
int j = 2;

if (i >= j) {
    System.out.println("i is greater than or equal to j");
}
```

### `&&`

The `and` operator returns whether or not the condition on the left `and` the condtion on the right are both true.

```java
int i = 3, j = 3, k = 7, l = 5;

if (i == j && k > l) {
    System.out.println("i equals j and k is greater than l");
}
```

### `||`

The `or` operator returns whether the condition on the left is true or the condition on the right is true.

```java
int i = 3;
int j = 7;

if (i > 5 || j < 10) {
    System.out.println("either i is greater than 5 or j is less than 10");
}
```

### `!`

The `!` or sometimes called `bang` is like adding `not` to the conditional statement.

For example

```java
int a = 1;
int b = 2;

boolean result = a > b; // = false
```

Using `!` in front of the conditional statement is like saying, `not a > b`.

```java
int a = 1;
int b = 2;

boolean result = !(a > b); // = true
```

### Operator precedence

`&&` is evaluated before `||` unless there are parentheses.

In this example, `b == c && c == 5` evaluates to `false`, then `a == d` is evaluated which makes the whole condition `true` so the statement will execute.

```java
int a = 1, b = 2, c = 3, d = 1;

if (a == d || b == c && c == 5) {
    System.out.println("This code will execute");
}
```

When we add parentheses, `a == d || b == c` evaluates to `true`, but `c == 5` evaluates to false making the whole condition `false` so the statement will not execute.

```java
int a = 1, b = 2, c = 3, d = 1;

if ((a == d || b == c) && c == 5) {
    System.out.println("Now it will not execute");
}
```
