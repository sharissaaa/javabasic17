import java.util.Arrays;

// Encapsulation example
class EncapsulationExample implements Cloneable {
    private int privateVar;

    // Getter
    public int getPrivateVar() {
        return privateVar;
    }

    // Setter
    public void setPrivateVar(int privateVar) {
        this.privateVar = privateVar;
    }

    // Override clone method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// Inheritance example
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Aggregation example
class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println("Car started");
    }
}

// Composition example
class Head {
    public void shake() {
        System.out.println("Head shakes");
    }
}

class Person {
    private Head head;

    public Person() {
        this.head = new Head();
    }

    public void shakeHead() {
        head.shake();
    }
}

// Abstract class example
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

// Interface example
interface Printable {
    void print();
}

class Printer implements Printable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}

public class Main {
    // Method Overloading example
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    // Constructor example
    public Main() {
        System.out.println("Constructor called");
    }

    // Static variable example
    static int staticVar = 10;

    // Static block example
    static {
        System.out.println("Static block executed");
    }

    // Static method example
    public static void staticMethod() {
        System.out.println("Static method called");
    }

    // Instance initializer block example
    {
        System.out.println("Instance initializer block executed");
    }

    // Method with 'this' keyword example
    public void display() {
        System.out.println("This is display method");
    }

    // Method Overriding example
    public void show() {
        System.out.println("Main class show method");
    }

    // Covariant Return Type example
    public Main getInstance() {
        return new Main();
    }

    // Final keyword example
    final int finalVar = 20;

    // Runtime Polymorphism example
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound(); // Output will be "Dog barks"

        // Downcasting with instanceof operator example
        Animal animal1 = new Dog();
        if (animal1 instanceof Dog) {
            Dog dog = (Dog) animal1;
            dog.sound(); // Output will be "Dog barks"
        }

        // Package and Access Modifiers example
        EncapsulationExample obj = new EncapsulationExample();
        obj.setPrivateVar(10);
        System.out.println("Private variable value: " + obj.getPrivateVar());

        // Object Cloning example
        EncapsulationExample obj1 = new EncapsulationExample();
        try {
            EncapsulationExample obj2 = (EncapsulationExample) obj1.clone();
            System.out.println("Object cloned successfully");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Java Array example
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }

        // Call By Value and Call By Reference example
        int x = 10;
        callByValue(x); // Output will be "Value before modification: 10"
        System.out.println("Value after modification: " + x); // Output will be "Value after modification: 10"

        int[] arr1 = {1, 2, 3};
        callByReference(arr1); // Output will be "Array before modification: [1, 2, 3]"
        for (int i : arr1) {
            System.out.print(i + " ");
        } // Output will be "Array after modification: [1, 4, 3]"
    }

    public static void callByValue(int x) {
        System.out.println("Value before modification: " + x);
        x = 20;
    }

    public static void callByReference(int[] arr) {
        System.out.println("Array before modification: " + Arrays.toString(arr));
        arr[1] = 4;
    }
}
