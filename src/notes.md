# **Day 1: Basic Java Concepts**

## **Modifiers in Java**

### **1. Access Modifiers** (Control visibility)

- `public` – Accessible from anywhere.
- `private` – Accessible only within the same class.
- `protected` – Accessible within the same package and by subclasses.
- *Default* (no keyword) – Accessible within the same package only.

### **2. Non-Access Modifiers** (Define additional properties)

- `abstract` – Used for abstract classes and methods.
- `static` – Allows methods or variables to belong to a class instead of instances.
- `final` – Prevents method overriding, variable modification, or class inheritance.
- `synchronized` – Ensures thread safety in multithreading.
- `native` – Used for linking Java methods with native (C/C++) code.

---

## **Abstract Class**

- A class that **cannot** be instantiated (i.e., objects cannot be created from it).
- Can contain **both abstract methods (without a body)** and **concrete methods (with implementation)**.
- Used when different classes share **common behavior but have their own specific implementations**.

### **Example:**

### **Concept**

Imagine a **Vehicle** class that defines general behavior, but specific types of vehicles (like Truck, Tractor, and Auto) implement the actual functionality.

### **Code Implementation**

```java

abstract class Vehicle {
   abstract void calcTripCost();   // Abstract method (no body)
   abstract void calcFuelEfficiency();
}

```

---

## **What is an Interface?**

- An **interface** is a blueprint for classes.
- It defines **only abstract methods** (until Java 8, after which default/static methods are allowed).
- **Used for defining common functionalities** across unrelated classes.

### **Example:**

Consider different flying objects like **Aeroplanes, Birds, and skatiman** They all can **fly**, but they are not related.

```java

interface Flyer {
   void takeOff();
   void fly();
   void land();
}  // All methods are implicitly public and abstract

```

### **Key Differences Between Abstract Class and Interface:**

| Feature | Abstract Class | Interface |
| --- | --- | --- |
| Inheritance | Single Inheritance | Multiple Inheritance |
| Methods | Can have abstract & concrete methods | Only abstract methods (until Java 8) |
| Variables | Can have instance variables | Only public, static, final variables |
| Usage | Used for objects with a common base | Used for unrelated classes with common behaviors |

---

## **Types of Interfaces in Java**

1. **General Interface**
   - A regular interface that is implemented using the `implements` keyword.
2. **Tag Interface**
   - An interface **without methods**, used for providing metadata (e.g., `Serializable`, `Cloneable`).
3. **SAM (Single Abstract Method) / Functional Interface**
   - Contains **only one abstract method**.
   - Allows **Lambda Expressions**.

---

## **Functional Interface (Single Abstract Method - SAM Interface)**

- A functional interface has **only one abstract method**.
- Can be used with **lambda expressions** to simplify code.

### **Example:**

```jsx
package Day1;

// Make the interface functional (remove default method)
@FunctionalInterface // it will restrict to deckare other methods
interface Myinter {
    void display();  // Abstract method (no default)
}

// Class implementing Myinter
class A implements Myinter {
    @Override
    public void display() {
        System.out.println("from a");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Creating an instance of A and calling display
        Myinter a1 = new A();
        a1.display();  // Output: from a

        // Anonymous class implementation
        Myinter a2 = new Myinter() {
            @Override
            public void display() {
                System.out.println("from the a2");
            }
        };
        a2.display();  // Output: from the a2

        // Lambda Expression
        Myinter a3 = () -> {
            System.out.println("from the a3");
        };
        a3.display();  // Output: from the a3
    }
}

```

---

## **Annotations in Java**

- **Annotations** are special markers used to provide metadata about Java code.
- They **do not affect the execution** of the program but can be processed at compile-time or runtime.
- Example: `@Override`, `@FunctionalInterface`, `@Deprecated`.

---

## **Java `Object` Class**

- Every class in Java **implicitly** extends `java.lang.Object`.
- It provides **common methods** that all Java classes inherit.

### **Example:**

```java

class Employee {}
class Employee extends Object {}  // Implicitly extends Object

```

### **Methods of `Object` Class**

1. `boolean equals(Object obj)` → Compares objects for equality.
2. `int hashCode()` → Returns a unique identifier for the object.
3. `String toString()` → Returns a string representation of the object.

### **Example: Overriding `toString()`**

```java

package Day1;

class Employee {
    int id;
    String name;
    double salary;

    Employee() {
        id = 101;
        name = "Ramesh";
        salary = 30000;
    }

    // Overriding toString() method
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e);  // Output: ID: 101, Name: Ramesh, Salary: 30000
    }
}

```

---

## **Wrapper Classes in Java**

Java provides **wrapper classes** for each primitive type to enable object-oriented programming.

### **Primitive Types vs. Wrapper Classes**

| **Primitive Type** | **Wrapper Class** |
| --- | --- |
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

### **Auto-Boxing & Auto-Unboxing**

- **Auto-Boxing** → Converts a primitive to its wrapper class automatically.
- **Auto-Unboxing** → Converts a wrapper class object back to its primitive type.

```java

public class WrapperExample {
    public static void main(String[] args) {
        int num = 10;
        Integer obj = num;  // Auto-Boxing (int → Integer)
        int num2 = obj;     // Auto-Unboxing (Integer → int)

        System.out.println("Auto-Boxed: " + obj);
        System.out.println("Auto-Unboxed: " + num2);
    }
}

```

---

## **Static Keyword in Java**

### **Static Members**

- `static` can be used with **variables, methods, and blocks**.
- A `static` variable is **shared among all instances** of a class.

### **Example: Static Variables**

```java
package Day1;

class Example {
    static int staticVar = 0;  // Shared across all instances
    int nonStaticVar = 0;      // Unique for each instance

    Example() {
        staticVar++;  // Shared among instances
        nonStaticVar++; // Separate for each instance
    }
}

public class Main3 {
    public static void main(String[] args) {
        System.out.println(Example.staticVar); // 0 (Accessed via class name)

        Example e1 = new Example();
        System.out.println(e1.nonStaticVar + " " + e1.staticVar); // 1 1

        Example e2 = new Example();
        System.out.println(e2.nonStaticVar + " " + e2.staticVar); // 1 2
    }
}

```

## **1. Static Methods and Variables**

- A **static method** can only access **static variables**.
- **Static methods cannot directly access non-static (instance) variables**.
- **Non-static methods** can access **both static and non-static members**.

### **Example:**

```java

class Example {
    static int staticVar = 10;
    int nonStaticVar = 20;

    // Static method - can only access static members
    static void staticMethod() {
        System.out.println("Static Variable: " + staticVar);
        // System.out.println(nonStaticVar); ❌ Error! Cannot access non-static variable
    }

    // Non-static method - can access both static and non-static members
    void nonStaticMethod() {
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Non-Static Variable: " + nonStaticVar);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        Example.staticMethod();  // Calling static method directly

        Example obj = new Example();
        obj.nonStaticMethod();  // Calling non-static method
    }
}

```

### **Output:**

```

Static Variable: 10
Static Variable: 10
Non-Static Variable: 20

```

---

## **2. Static Block**

- **Static blocks execute before the `main` method**, when the class is loaded.
- Even if the `main` method is empty, the **static block will execute**, but there will be **no output** if it doesn't contain a print statement.

### **Example:**

```java
class Test {
    static {
        System.out.println("Static block executed!");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed!");
    }
}

```

### **Output:**

```

Static block executed!
Main method executed!
```

---

## **3. Final Keyword in Java**

The `final` keyword can be used with **classes, methods, and variables**.

### **(a) Final Class**

- A **final class cannot be extended** (no child classes allowed).

```java

final class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

// ❌ This will cause an error
// class Child extends Parent {}  // Error: Cannot inherit from final class

```

---

### **(b) Final Method**

- A **final method cannot be overridden** by child classes.

```java
class Parent {
    final void display() {
        System.out.println("Final method in Parent class");
    }
}

class Child extends Parent {
    // ❌ This will cause an error
    // void display() { System.out.println("Trying to override"); } // Error: Cannot override final method
}

```

---

### **(c) Final Variable**

- A **final variable cannot be modified** after initialization.

```java

class Example {
    final int maxSpeed = 120;

    void changeSpeed() {
        // maxSpeed = 150; ❌ Error: Cannot modify a final variable
        System.out.println("Max Speed: " + maxSpeed);
    }
}
```

# **Exception Handling in Java**

## **What is an Exception?**

- An **exception** is an **unexpected event** that occurs **during program execution** and disrupts the normal flow of instructions.
- Exception handling **prevents program crashes** and ensures the program runs smoothly.

## **What is Exception Handling?**

- **Exception Handling** is a mechanism in Java to handle **runtime errors** and maintain the **normal flow** of the program.
- Java provides a **robust exception-handling framework** that helps developers handle errors efficiently.

---

## **Types of Exceptions in Java**

In Java, all exceptions are derived from the **`Throwable`** class.

```php

                      Object
                        │
                    Throwable
                   ┌──────────┐
                  Error      Exception
                   │          ├── Checked Exception
                   │          ├── Unchecked Exception

```

### **1. Exception (`java.lang.Exception`)**

Exceptions can be classified into two types:

### **(a) Checked Exceptions**

- **Known at compile time** – The compiler forces the developer to handle these exceptions using `try-catch` or `throws`.
- Examples:
   - `IOException` (File handling error)
   - `SQLException` (Database error)
   - `ClassNotFoundException`

### **(b) Unchecked Exceptions (Runtime Exceptions)**

- **Occur at runtime** – The compiler does not check for these exceptions.
- Examples:
   - `NullPointerException` (Accessing an object reference that is `null`)
   - `ArrayIndexOutOfBoundsException` (Accessing an invalid array index)
   - `ArithmeticException` (Dividing by zero)

---

### **2. Errors (`java.lang.Error`)**

- Errors **cannot be handled** in Java as they occur due to system-level issues.
- Examples:
   - `StackOverflowError` (Infinite recursion causes stack memory overflow)
   - `OutOfMemoryError` (JVM runs out of memory)

---

## **Basic Exception Handling in Java**

Java provides a `try-catch` mechanism to handle exceptions.

### **Example: Handling ArithmeticException**

```java

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // Causes ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        System.out.println("Program continues...");
    }
}

```

### **Output:**

```

Error: Cannot divide by zero.
Program continues...
```