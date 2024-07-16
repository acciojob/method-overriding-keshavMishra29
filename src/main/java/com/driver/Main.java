package com.driver;

public class Main {
    public static class A {
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
        A keshav = new A();
        System.out.println(keshav.meth());
        B obj = new B();
        System.out.println(obj.meth());
    }
}