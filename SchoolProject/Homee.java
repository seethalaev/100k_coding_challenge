package SchoolProject;

import java.util.Scanner;

    class Girl
    {
        String name;
        int maths;
        int chem;
        String subj;
        int total=0;
        Scanner s=new Scanner(System.in);
    
    void AddData()
    {
        System.out.println("Enter name");
        name=s.nextLine();
        System.out.println("Enter maths mark");
        maths=s.nextInt();
        System.out.println("Enter chemistry mark");
        chem=s.nextInt();
        s.nextLine();
        System.out.println("Enter subject");
        subj=s.nextLine();
        
    }
    void ShowData()
    {
        System.out.println("Name is :"+name);
        System.out.println("Maths :"+maths);
        System.out.println("Chemistry :"+chem);
        System.out.println("Subject :"+subj);
        System.out.println("Total :"+total);
    }
    void GetTotal()
    {
        total=maths+chem;
    }
    }
    public  class Homee
    {
    public static void main(String args[])
    {
            Girl g=new Girl();

    }}
