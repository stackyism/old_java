import java.io.*;
public class fnretarm
{
    public int retarm(int a)
    {
        int sum=0;
        while(a!=0)
        {
            int n=a%10;
            sum=sum+(n*n*n);
            a=a/10;
        }
        return sum;
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        fnretarm h=new fnretarm();
        int x=h.retarm(a);
        int a1=a;
        if(x==a1)
        {
            System.out.println("The number is Armstrong");
        }
        else
        {
            System.out.println("The number is not Armstrong");
        }
    }
}