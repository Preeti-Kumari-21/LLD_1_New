package main.java.org.example.introToOOPS;

public class Student {
    public String name;
    protected int age;
    String batchName;
    private double psp;
    String email;

    void attendClass(){
        System.out.println("Student is attending class.");
    }

    void bookMockInterview(){
        Student student = new Student();
        student.psp = 85.5;
        System.out.println("Student is booking a mock interview.");
    }

}
