package Udemy;

public class InherChil extends InherPara
{
    public void Engine()
    {
        System.out.println("engine works");
    }
    public void colour()
    {
        System.out.println(colour);
    }
    public static void main(String[] args) 
    {
        InherChil cd=new InherChil();
        cd.colour();
        cd.Break();
        cd.Engine();
        cd.Gear();
        cd.audeosystem();
    }
}
