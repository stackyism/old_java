import java.io.*;
public class create
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        
        System.out.println("The number you entere is :"+a);
    }
}