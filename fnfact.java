import java.io.*;
public class fnfact
{
    public void fact(int a)
    {
        int f=1;
        for(int i=1;i<=a;i++)
        {
            f=f*i;
        }
        System.out.println("The factorial of nos. is:-->  "+f);
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        fnfact h=new fnfact();
        h.fact(a);
    }
}