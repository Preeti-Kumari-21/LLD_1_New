package main.java.org.example.Polymorphism;

public class Clients {
    public static void main(String[] args) {
        /*A a = new C();
        a.Aname = "C instance";*/

        A a = new A("A instance");
       // a.Aname = "A instance";

        A a1 = new D();
        //a1.dname = "D instance";

        D d = new D();
        d.Aname = "D instance";
        d.Dname = "D instance using D object";
    }
}
