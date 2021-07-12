## Member access

### Class level access

In Java, a class may be declared as `public` which means it is visible to all classes anywhere. If the class is not declared as `public` it is assigned `default` access which means it is only visible to classes within the same `package`.

#### A class with `public` access

```java
package com.mypackage;

public class MyClass {
    public String sayHello() {
        return "hello";
    }
}
```

Some other class in another package or another application has access to `MyClass`.

```java
package com.someotherpackage;

import com.mypackage.MyClass;

public class SomeOtherClass {
    public void hasAccessToMyClass() {
        System.out.println(new MyClass().sayHello());
    }
}
```

#### A class with `default` access

In this example, `MyClass`, with default access, can only be accessed by classes within the same `package`.

```java
package com.mypackage;

class MyClass {
    public String sayHello() {
        return "hello";
    }
}
```

Some other class in another package or another application does not have access to `MyClass`.

```java
package com.someotherpackage;

import com.mypackage.MyClass; // error

public class SomeOtherClass {
    public void doesNotHaveAccessToMyClass() {
        MyClass mine = new MyClass(); // error
    }
}
```

### Member level access

### public

A class member variable or function defined as `public` will be visible to all classes anywhere.

```java
package com.mypackage;

public class MyClass {

    public String name = "John";

    public String sayHello() {
        return "hello";
    }
}
```

Some other class in another package or another application has access to `name` and `sayHello`.

```java
package com.someotherpackage;

import com.mypackage.MyClass;

public class SomeOtherClass {
    public void hasAccessToSayHelloAndName() {
        MyClass myClass = new MyClass();
        System.out.println(myClass.sayHello());
        System.out.println(myClass.name);
    }
}
```

### protected

A class member variable or function defined as `protected` will only be visible to subclasses and classes within the same `package`.

```java
package com.mypackage;

public class MyClass {

    protected String name = "John";

    protected String sayHello() {
        return "hello";
    }
}
```

Some other class in another package or another application does not have access to `MyClass` `name` or `sayHello`.

```java
package com.someotherpackage;

import com.mypackage.MyClass;

public class SomeOtherClass {
    public void hasNoAccessToSayHelloAndName() {
        MyClass myClass = new MyClass();
        System.out.println(myClass.sayHello()); // error
        System.out.println(myClass.name); // error
    }
}
```

### default

A class member variable or function defined as `default` (no declaration) will only be visible to classes within the same `package`.

```java
package com.mypackage;

public class MyClass {

    String name = "John";

    String sayHello() {
        return "hello";
    }
}
```

Some other class in another package or another application does not have access to `MyClass` `name` or `sayHello`.

```java
package com.someotherpackage;

import com.mypackage.MyClass;

public class SomeOtherClass {
    public void hasNoAccessToSayHelloAndName() {
        MyClass myClass = new MyClass();
        System.out.println(myClass.sayHello()); // error
        System.out.println(myClass.name); // error
    }
}
```

### private

A class member variable or function defined as `private` will only be visible to other members within the same class.

```java
package com.mypackage;

public class MyClass {

    private String name = "John";

    private String sayHello() {
        return "hello";
    }

    public String canAccessSayHelloAndName() {
        return sayHello() + " " + name;
    }
}
```

Some other class in another package or another application does not have access to `MyClass` `name` or `sayHello`.

```java
package com.someotherpackage;

import com.mypackage.MyClass;

public class SomeOtherClass {
    public void hasNoAccessToSayHelloAndName() {
        MyClass myClass = new MyClass();
        System.out.println(myClass.sayHello()); // error
        System.out.println(myClass.name); // error
    }
}
```
