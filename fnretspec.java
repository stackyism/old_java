import java.io.*;
public class fnretspec
{
    public int retspec(int a)
    {
        int sum=0;
        int f=1;
        while(a!=0)
        {
            int n=a%10;
            for(int i=1;i<=n;i++)
            {
                f=f*i;
            }
            sum=sum+f;
            a=a/10;
            f=1;
        }
        return sum;
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        fnretspec h=new fnretspec();
        int x=h.retspec(a);
        int a1=a;
        if(x==a1)
        {
            System.out.println("The number is special.  ");
        }
        else
        {
            System.out.println("The number is not special.");
        }
    }
}