
package Construcr;

class Student {
    
    String name;  // Static variable shared by all Student objects //static String name;
    int mark;            // Instance variable unique to each object
}

public class Staticii {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "seethu";
        s.mark = 50;

        Student t = new Student();
        t.name = "arun";  // Overwrites the static variable 'name' for all instances
        t.mark = 100;

        // Print values for both objects
        System.out.println("Student s -> Name: " + s.name + ", Mark: " + s.mark);
        System.out.println("Student t -> Name: " + t.name + ", Mark: " + t.mark);
    }
}
