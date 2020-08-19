package com.ibm.fp.basics.rule;

@FunctionalInterface
interface Hello {
    void sayHello();
}

public class FunctionalAnnotation {
    public static void main(String[] args) {
        Hello hello = null;
        hello = () -> {
            System.out.println("Hello");
        };
        hello.sayHello();

    }
}
