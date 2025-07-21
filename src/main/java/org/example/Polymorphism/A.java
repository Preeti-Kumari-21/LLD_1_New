package main.java.org.example.Polymorphism;

public class A {
    String Aname;

    A(){
    System.out.println("Constructor A called "+Aname);
    }

    A(String Aname){
        System.out.println("Parameterized Constructor A called "+Aname);
    }
}
