package Inheritance.Student;


public class student
{
    public static String fname;
    public static String lname;
    
    public student(String Xfirst,String Xlast)
    {
        Xfirst=fname;
        Xlast=lname;
    }
    
    public static void printData(String Xfirst,String Xlast)
    {
        System.out.println("Frist name is:-->  "+fname);
        System.out.println("");
        System.out.println("Last name is:-->  "+lname);
    }
}
        