import java.io.*;
public class fnspec
{
    public void spec(int a)
    {
        double sum=0;
        int f=1,a1=a;
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
        if(sum==a1)
        {
            System.out.println("The number is special.  ");
        }
        else
        {
            System.out.println("The number is not special.");
        }
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        fnspec h=new fnspec();
        h.spec(a);
    }
}