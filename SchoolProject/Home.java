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
    }
    void getTotal()
    {
        total=maths+phy+chem;
    }
    
    // void AddStudentData()
    // {  
    //     System.out.println("Enter name :");
    //     name=s.nextLine();
    //     System.out.println("Enter chemistry mark :");
    //     chem=s.nextInt();
    //     System.out.println("Enter maths mark :");
    //     maths=s.nextInt();
    //     System.out.println("Enter physics mark :");
    //     phy=s.nextInt();
    // }
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
      // s1.AddStudentData();
       s1.getData();
       s1.getTotal();
       s1.getData();
      
    }
}
