package Inheritance.Student;

public class Graduate extends student
{
    private static String Stream;
    private static String Degree;
    
    public Graduate(String fname,String lname,String XStream,String XDegree)
    {
        super(fname,lname);
        XStream=Stream;
        XDegree=Degree;
    }
    
    public static void printGraduate(String fname,String lname,String Stream,String Degree)
    {
        printData n=new printData();
        s.student(fname,lname);
        System.out.println("Stream is:-->  "+Stream);
        System.out.println("Degree is:-->  "+Degree);
    }
}