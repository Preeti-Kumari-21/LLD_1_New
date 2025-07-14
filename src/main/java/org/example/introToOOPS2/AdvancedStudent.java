package main.java.org.example.introToOOPS2;

import main.java.org.example.introToOOPS.Student;

public class AdvancedStudent extends Student {

    AdvancedStudent(){
        Student student1 = new Student();
        student1.name = "Kumar Prashant";
        this.age = 37; // age is protected, accessible in subclass

      //  this.batchName = "Java Programming"; // not accessible outside the package even in child class as the batchName is
        // default

        //student1.psp = 85.5;
    }
}
