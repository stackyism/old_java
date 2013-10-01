import java.io.*;
public class factorial1
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter the number to have factorial of it.");
        int n=Integer.parseInt(input.readLine());
        double f=1;
        for(int i=1;i<=n;i++)
        {
           f=f*i;
        }
        System.out.println("The Factorial is:-->  "+f );
    }
}