package main.java.org.example.introToOOPS2;

import main.java.org.example.introToOOPS.Student;

public class CheckProtectedAccess {
    CheckProtectedAccess(){
        Student student1 = new Student();
        student1.name = "KPPKVASU";
        //this.age = 37; // This will cause an error if accessed outside the package
        // because 'age' is protected and this class is not a subclass of Student.
        //student1.age = 37; // This will also cause an error for the same reason.

    }


}
