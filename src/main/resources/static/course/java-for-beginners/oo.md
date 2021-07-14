## Object oriented concepts

### Classes

A `class` is the definition of something and it can have `properties` and `methods`. Think of a lion as a `class` named Lion. Instances of lion will have the same properties and methods and their property values can vary. 

`Classes` allow us to define attributes and logic associated with a particular type of thing. An instance of a class, an object, is one of a type of thing. In programming, object-oriented techniques make the code more organized and should be more maintainable.

Simba is an instance of Lion and has these property values:

* name = Simba,
* age = 1 year,
* size = small

Mufasa is an instance of Lion and has these property values:

* name = Mufasa,
* age = 12 years,
* size = big

The methods for all Lions are the same:

* run,
* sleep,
* roar

As instances of the Lion class:

```java
Lion simba = new Lion("Simba", 1, "small");
Lion mufasa = new Lion("Mufasa", 12, "big");
```

We can make Mufasa roar with:

```java
mufasa.roar();
```

and, we can make Simba run with:

```java
simba.run();
```

Just like with real animals, we have `Inheritance`, all mammals have similar `properties` and `methods`.

Lions inherit `properties` and `methods` from Mammal. They have hair and breath air. As such, we can make Simba breath with:

```java
simba.breath();
```

### Object-oriented terms

`Polymorphism` allows some classes in the LandAnimal `inheritance` tree to `run()` faster than others. A Cheetah can `run()` really fast, a Tortoise will `run()` really slow.

`Abstraction` is an object-oriented term for grouping common `properties` and `methods` into classes, like we did for Animal, Mammal, and Lion.

`Encapsulation` is where state variables and method implementation details are hidden inside the class and not accessible from outside of the class.

`Inheritance` allows classes to be derived from another class to `inherit` its properties and methods. 
