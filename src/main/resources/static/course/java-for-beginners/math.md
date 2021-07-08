## Math

### Arithmatic Operators

#### Addition

To get the sum of addens,

```java
int sum = 2 + 3; // = 5
```

#### Subtraction

To get the difference the minuend and the subtrahend,

```java
int difference = 5 - 3; // = 2
```

#### Multiplication

To get the product of the multiplicand and the multiplier,

```java
int product = 5 * 3; // = 15
```

#### Division

To get the quotient of the dividend and the divisor,

```java
int quotient = 15 / 3; // = 5
```

For decimal answers, you will want to use float or double instead of an int which will only store the whole number and it will leave off the decimal portion of the answer.

```java
int quotient = 17 / 4; // = 4
```

Also, either the dividend or the divisor or both must be a decimal type to yield a decimal answer.

```java
double quotient = 17 / 4f; // =  4.25
```

Unless you cast the answer. To `cast` is to attempt to convert a type to another, if possible.

```java
double quotient = (double) 17 / 4; // = 4.25
```

#### Modulo

Modulo will give you the remainder of division.

```java
int remainder = 17 % 3; // = 2
```

### Operator Precedence

Array access, parentheses, and member access operations are processed first.

`[]` `()` `.`

Multiplication, division, and modulo operations are processed next.

`*` `/` `%`

Addition, and subtraction are next.

`+` `-`

Examples

```java
int answer = 2 + 3 * 4; // = 14, not 20
```

```java
int answer = (2 + 3) * 4; // = 20
```

```java
int answer = 17 % 3 + 2; // = 4, not 2
```

```java
int answer = 17 % (3 + 2); // = 2
```

### Math class

The `Math` class in Java performs basic math operations such as square root, absolute value, tangent, and many more.

Detailed information about the `Math` class can be found here,

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html

Examples

To find the absolute value of a number

```java
int abs = Math.abs(-17); // = 17
```

To find the square root of a number

```java
int sqrt = Math.sqrt(16); // = 4
```

To find the maximum number between two numbers

```java
int max = Math.max(12, 7); // = 12
```

To find 10 to the power of 3

```java
double pow = Math.pow(10, 3); // = 1000.0
```