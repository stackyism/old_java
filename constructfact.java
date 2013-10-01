//To determine the factorial of the no. entered by user.
import java.io.*;
public class constructfact
{
    public void constructfact(int a)
    {
        int f=1;
        for(int i=1;i<=a;i++)
        {
            f*=i;
        }
        System.out.println("The factorial of "+a+" is:-->  "+f);
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter the no. for its factorial-->");
        int n=Integer.parseInt(input.readLine());
        constructfact c=new constructfact();
        c.constructfact(n);
    }
}
        