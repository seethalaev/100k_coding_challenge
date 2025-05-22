package Udemy;
public class Srt
 {
    public static void main(String[] args)
     {
        //String str1="java";
    // String str2="java";
    // String str1=new String("java");
        // String str2=new String("java");
        // System.out.println(str1==str2);

        // String str3=new String("java");
        // System.out.println(str3.length());
        // String str4=str3.toUpperCase();
        // System.out.println(str4);
       
        String str5=new String("Mr.shahrukh khan");
        System.out.println(str5.startsWith("h",4));
        System.out.println(str5.endsWith("n"));
        System.out.println(str5.indexOf("."));

        String str6=new String("www.selenium.com");
        System.out.println(str6.indexOf("selenium"));
        System.out.println(str6.indexOf(".",4));
    }
}
