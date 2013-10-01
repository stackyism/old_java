import java.io.*;
public class add
{
    public static void main(String arg[])throws IOException
{
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter any no.");
    double a=Double.parseDouble(input.readLine());
    System.out.println("Enter another no.");
    double b=Double.parseDouble(input.readLine());
    double c=a+b;
    System.out.println("The addition is: "+c);
}
}