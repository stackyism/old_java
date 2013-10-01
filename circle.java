//To determine the area of circle with radius entered by user.
import java.io.*;

public class circle

{
    public static void main(String arg[])throws IOException
    {
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter the radius");
    double r=Double.parseDouble(input.readLine());
    double mul;
    mul=(double)3.14*r*r;
    System.out.println("The area is :"+mul);
}
}
    
    