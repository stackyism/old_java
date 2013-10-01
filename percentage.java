import java.io.*;
public class percentage
{
    public static void main(String arg[])throws IOException
    {
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter marks in maths");
    System.out.println("Enter marks in physics");
    System.out.println("Enter marks in chemistry");
    System.out.println("Enter marks in english");
    System.out.println("Enter marks in e.v.s");
    double a=Double.parseDouble(input.readLine());
    double b=Double.parseDouble(input.readLine());
    double c=Double.parseDouble(input.readLine());
    double d=Double.parseDouble(input.readLine());
    double e=Double.parseDouble(input.readLine());
    double f=(a+b+c+d+e)/500;
    double g=f*100;
    if((g<=35))
    System.out.println("the student failed: "+g);
    else if((g>=36)&&(g<50))
    System.out.println("the student gets 3rd division: "+g);
    else if((g>=51)&&(g<60))
    System.out.println("the student gets 2nd division: "+g);
    else
    System.out.println("the student gets 1st division: "+g);
}
}
    
    
    
