package main.java.org.example.ConstructorChaningExceptions1;

public class C extends B {
     C(){
        System.out.println("Constructor C called");
    }

     C(int a ){
         System.out.println("Constructor C called with parameter: " + a);
    }
}
