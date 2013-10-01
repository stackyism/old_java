import java.io.*;
public class fnper
{
    public void per(int n)
    {
        int n1=n;
        double sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n1)
        {
            System.out.println("The number is perfect.");
        }
        else
        {
            System.out.println("The number is not perfect.");
        }
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        fnper h=new fnper();
        h.per(a);
    }
}