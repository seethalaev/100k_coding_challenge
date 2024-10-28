package Day_8;
public class Student
{
static String name;
int mark;
}


public class Static
 {
    public static void main (String []args)
    {
        Student s=new Student();
        s.name="seethu";
        s.mark=50;
        Student t=new Student();
        t.name="arun";
        t.mark=100;
        
        System.out.println(s.name);



    }
}
