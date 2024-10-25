package SchoolProject;

class Student
{
    String name;
    int maths;
    int phy;
    int chem;
    int total=0;
        
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

    void getTotal()
    {
        total=maths+phy+chem;
    }
}
public class Home 
{
    public static void main(String args[])
    {
       Student s1=new Student();
       s1.name="arun";
       s1.maths=50;
       s1.phy=20;
       s1.chem=30;
       s1.getTotal();
       s1.getData();

       Student s2=new Student();
       s2.name="amal";
       s2.maths=60;
       s2.phy=30;
       s2.chem=40;
       s2.getTotal();
       s2.getData();    
    }
}
