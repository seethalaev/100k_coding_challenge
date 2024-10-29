package Day_9;

class Student
{
    String name;
    int marks;
    int total;
    Student(String a,int b) //constructer function
    {
        System.out.println("constructer created");
        name = a;
        marks = b;
    }
}

public class School {
    public static void main(String[] args) {
        System.out.println("this is kannur school");
        Student s1 = new Student("aleena",10);
        Student s2 = new Student("amal",100);



        
    }
}
