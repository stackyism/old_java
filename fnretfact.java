import java.io.*;
public class fnretfact
{
    public int retfact(int a)
    {
        int f=1;
        for(int i=1;i<=a;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        fnretfact h=new fnretfact();
        int x=h.retfact(a);
        System.out.println("The factorial of nos. is:--> "+x);
    }
}