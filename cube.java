import java.io.*;
public class cube
{
    public static void main(String arg[])throws IOException
    {
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter the side of cube");
    double a=Double.parseDouble(input.readLine());
    double d=a*a*a;
    System.out.println("The volume of cube is: "+d);
}
}