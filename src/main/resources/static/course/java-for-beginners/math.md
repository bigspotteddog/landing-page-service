## Math

### Correction

CORRECTION: In the video for the future value of a monthly investment, we did not do $500 per month, we did $500 per year.

We want,

* PMT = 500
* i = 0.08 / 12 = 0.667
* n = 20 * 12 = 240

That will give us the correct value when applied monthly: $296,622.01 instead of $24,711 which is a huge difference.

### Arithmetic Operators

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

### Exercise 4: Applied Math

#### Warm-up

Calculate the area of a triangle using the formula b / 2 * height with a base of 10 and a height of 15.

#### How much will this be?

Calculate the future value of $10,000 earning 8% interest per year for 20 years using,

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/KaTeX/0.10.0/katex.min.css">

<span class="katex" style="margin-top: 30px:"><span class="katex-mathml"><math><semantics><mrow><mi>F</mi><mi>V</mi><mo>=</mo><mi>P</mi><mi>V</mi><mo>(</mo><mn>1</mn><mo>+</mo><mi>i</mi><msup><mo>)</mo><mi>n</mi></msup></mrow><annotation encoding="application/x-tex">FV = PV(1 + i)^{n}</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.68333em; vertical-align: 0em;"></span><span class="mord mathdefault" style="margin-right: 0.13889em;">F</span><span class="mord mathdefault" style="margin-right: 0.22222em;">V</span><span class="mspace" style="margin-right: 0.277778em;"></span><span class="mrel">=</span><span class="mspace" style="margin-right: 0.277778em;"></span></span><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mord mathdefault" style="margin-right: 0.13889em;">P</span><span class="mord mathdefault" style="margin-right: 0.22222em;">V</span><span class="mopen">(</span><span class="mord">1</span><span class="mspace" style="margin-right: 0.222222em;"></span><span class="mbin">+</span><span class="mspace" style="margin-right: 0.222222em;"></span></span><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mord mathdefault">i</span><span class="mclose"><span class="mclose">)</span><span class="msupsub"><span class="vlist-t"><span class="vlist-r"><span class="vlist" style="height: 0.714392em;"><span class="" style="top: -3.113em; margin-right: 0.05em;"><span class="pstrut" style="height: 2.7em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mtight"><span class="mord mathdefault mtight">n</span></span></span></span></span></span></span></span></span></span></span></span>

where,

* FV = future value
* PV = present value
* i = interest rate
* n = number of periods

Add the future value of $500 per month earning 8% interest per year for 20 years using,

<div class="katex" style="margin-top:30px"><span class="katex-mathml"><math><semantics><mrow><mi>F</mi><mi>V</mi><mo>=</mo><mi>P</mi><mi>M</mi><mi>T</mi><mo>(</mo><mn>1</mn><mo>+</mo><mi>i</mi><mo>)</mo><mrow><mo fence="true">(</mo><mfrac><mrow><mo>(</mo><mn>1</mn><mo>+</mo><mi>i</mi><msup><mo>)</mo><mi>n</mi></msup><mo>−</mo><mn>1</mn></mrow><mi>i</mi></mfrac><mo fence="true">)</mo></mrow></mrow><annotation encoding="application/x-tex">FV = PMT(1 + i) \left( \frac{(1 + i)^{n} - 1}{i}\right) </annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.68333em; vertical-align: 0em;"></span><span class="mord mathdefault" style="margin-right: 0.13889em;">F</span><span class="mord mathdefault" style="margin-right: 0.22222em;">V</span><span class="mspace" style="margin-right: 0.277778em;"></span><span class="mrel">=</span><span class="mspace" style="margin-right: 0.277778em;"></span></span><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mord mathdefault" style="margin-right: 0.13889em;">P</span><span class="mord mathdefault" style="margin-right: 0.10903em;">M</span><span class="mord mathdefault" style="margin-right: 0.13889em;">T</span><span class="mopen">(</span><span class="mord">1</span><span class="mspace" style="margin-right: 0.222222em;"></span><span class="mbin">+</span><span class="mspace" style="margin-right: 0.222222em;"></span></span><span class="base"><span class="strut" style="height: 2.40003em; vertical-align: -0.95003em;"></span><span class="mord mathdefault">i</span><span class="mclose">)</span><span class="mspace" style="margin-right: 0.166667em;"></span><span class="minner"><span class="mopen delimcenter" style="top: 0em;"><span class="delimsizing size3">(</span></span><span class="mord"><span class="mopen nulldelimiter"></span><span class="mfrac"><span class="vlist-t vlist-t2"><span class="vlist-r"><span class="vlist" style="height: 1.427em;"><span class="" style="top: -2.314em;"><span class="pstrut" style="height: 3em;"></span><span class="mord"><span class="mord mathdefault">i</span></span></span><span class="" style="top: -3.23em;"><span class="pstrut" style="height: 3em;"></span><span class="frac-line" style="border-bottom-width: 0.04em;"></span></span><span class="" style="top: -3.677em;"><span class="pstrut" style="height: 3em;"></span><span class="mord"><span class="mopen">(</span><span class="mord">1</span><span class="mspace" style="margin-right: 0.222222em;"></span><span class="mbin">+</span><span class="mspace" style="margin-right: 0.222222em;"></span><span class="mord mathdefault">i</span><span class="mclose"><span class="mclose">)</span><span class="msupsub"><span class="vlist-t"><span class="vlist-r"><span class="vlist" style="height: 0.664392em;"><span class="" style="top: -3.063em; margin-right: 0.05em;"><span class="pstrut" style="height: 2.7em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mtight"><span class="mord mathdefault mtight">n</span></span></span></span></span></span></span></span></span><span class="mspace" style="margin-right: 0.222222em;"></span><span class="mbin">−</span><span class="mspace" style="margin-right: 0.222222em;"></span><span class="mord">1</span></span></span></span><span class="vlist-s">​</span></span><span class="vlist-r"><span class="vlist" style="height: 0.686em;"><span class=""></span></span></span></span></span><span class="mclose nulldelimiter"></span></span><span class="mclose delimcenter" style="top: 0em;"><span class="delimsizing size3">)</span></span></span></span></span></div>

where,

* FV = future value
* PMT = payment = 500
* i = interest rate = 0.8 / 12
* n = number of periods = 20 * 12

### Correction

CORRECTION: In the video, we did not do $500 per month, we did $500 per year.

We want,

* PMT = 500
* i = 0.08 / 12 = 0.667
* n = 20 * 12 = 240

That will give us the correct value when applied monthly: $296,622.01 instead of $24,711 which is a huge difference.
