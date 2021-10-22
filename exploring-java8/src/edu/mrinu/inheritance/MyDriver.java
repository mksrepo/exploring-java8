package edu.mrinu.inheritance;

class Grandfather {
    public void display() {
        System.out.println("Grandfather");
    }
}

class Parent {
    public void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public void display() {
        System.out.println("Child");
    }
}

public class MyDriver {
    public static void Main(String[] args) {
        Child child = new Child();
    }
}
