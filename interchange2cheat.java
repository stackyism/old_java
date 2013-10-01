import java.io.*;
public class interchange2cheat
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter the value of a");
        int a=Integer.parseInt(input.readLine());
        System.out.println("Enter value of b");
        int b=Integer.parseInt(input.readLine());
        System.out.println("Values after inter changing are---->");
        System.out.println("Value of a="+b);
        System.out.println("Value of b="+a);
    }
}