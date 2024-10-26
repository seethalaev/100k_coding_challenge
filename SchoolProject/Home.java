package SchoolProject;

import java.util.Scanner;
class Student
{
    String name;
    int maths;
    int phy;
    int chem;
    int total=0;
    Scanner s = new Scanner(System.in);

    void getData()
    {
        System.out.println("=====================");
        System.out.println("Name is:"+name);
        System.out.println("Maths is:"+maths);
        System.out.println("Physics is:"+phy);
        System.out.println("Chemistry is:"+chem);
        System.out.println("Total mark is:"+total);
        System.out.println("=====================");
    }

    
    void AddStudentData()
    {  
        System.out.println("Enter name :");
        name=s.nextLine();
        System.out.println("Enter chemistry mark :");
        chem=s.nextInt();
        System.out.println("Enter maths mark :");
        maths=s.nextInt();
        System.out.println("Enter physics mark :");
        phy=s.nextInt();
    }
}
public class Home 
{
    public static void main(String args[])
    {
       Student s1=new Student();
       
       // hard coding class variables
       s1.name="arun";
       s1.maths=50;
       s1.phy=20;
       s1.chem=30;
       s1.AddStudentData();
       s1.getData();
       s1.getTotal();
       s1.getData();
      
    }
}
