package edu.mrinu.basic;

interface Left {
    default void method() {
        System.out.println("Left method");
    }

    default void AnotherMethod() {}

    public static void staticMethod() {}

    public static void main(String[] args){
        System.out.println("Main within Interface");
    }
}

interface Right {
    default void method() {
        System.out.println("Right method");
    }
}

public class DefaultMethod implements Left, Right{

    public static void main(String[] args) {
        // Static method of Interface is accessible with Interface name only
        Left.staticMethod();
        new DefaultMethod().method();
    }

    @Override
    public void method() {
        System.out.println("My method");
        Left.super.method();
        Right.super.method();
    }
}
