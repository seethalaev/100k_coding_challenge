package oops;

class Rectangle{
    int length;
    int breadth;

    void getData()
    {
        System.out.println("length is :"+ length);
        System.out.println("breadth is:"+ breadth);
    }
}

public class Home {
    public static void main(String[] args) {
        System.out.println("arun");
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle();
        
        R1.length=10;
        R1.breadth=20;

        R2.length=50;
        R2.breadth=60;

        R1.getData();
        R2.getData();
    }
    
}
