package Javacourse;

public class Spcl 
{
    public static void main(String[] args)
    {
        //REMOV SPCL CHARCTRS
        String str1="AcB1@SD%@23";
        System.out.println(str1.replaceAll("[^a-zA-Z0-9]", ""));
        
        //remove spaces
        String str2="    abc     sksa    jjja";
       //  System.out.println(str2.replaceAll("[\\s]+", " "));
        System.out.println(str2.replaceAll("[\\s]+","  ").trim());

        
        //length of words
        String words[]=str2.split("[//s]");
        System.out.println(words.length);
    }
}
