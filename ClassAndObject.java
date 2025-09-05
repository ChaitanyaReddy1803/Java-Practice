// ClassAndObject.java
class Student {
    // Attributes
    String name;
    int age;

    // Method
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        // Create object of Student
        Student s1 = new Student();

        // Assign values
        s1.name = "Pranaw";
        s1.age = 22;

        // Call method
        s1.displayInfo();
    }
}
