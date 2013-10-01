import java.io.*;
public class fnretper
{
    public int retper(int n)
    {
        
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        fnretper h=new fnretper();
        int n1=a;
        int x=h.retper(a);
        if(x==n1)
        {
            System.out.println("The number is perfect.");
        }
        else
        {
            System.out.println("The number is not perfect.");
        }
    }
}