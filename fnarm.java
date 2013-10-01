import java.io.*;
public class fnarm
{
    public void arm(int a)
    {
        int a1=a;
        double sum=0;
        while(a!=0)
        {
            int n=a%10;
            sum=sum+(Math.pow(n,3));
            a=a/10;
        }
        if(sum==a1)
        {
            System.out.println("The number is Armstrong");
        }
        else
        {
            System.out.println("The number is not Armstrong");
        }
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        fnarm h=new fnarm();
        h.arm(a);
    }
}