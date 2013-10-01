//To find volume of sphere and taking its radius from user. 
import java.io.*;
public class sphere
{
    public static void main(String arg[])throws IOException
    {
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter the radius of sphere");
    double a=Double.parseDouble(input.readLine());
    double d=4/3*(3.14*a*a*a);
    System.out.println("The volume of Sphere is: "+d);
}
}