//To find area of rectangle by taking its lenght and breadth from user. 
import java.io.*;
public class rectangle
{
    public static void main(String arg[])throws IOException  
    {
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter the Length and Breadth of Rectangle");
    double a=Double.parseDouble(input.readLine());
    double b=Double.parseDouble(input.readLine());
    double c=a*b;
    System.out.println("The area of rectangle is: "+c);
}
}
