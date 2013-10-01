import java.io.*;
public class fnretpellin
{
    public int retpellin(int a)
    {
        int sum=0;
        while(a!=0)
        {
            int n=a%10;
            sum=(sum*10)+n;
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
        fnretpellin h=new fnretpellin();
        int x=h.retpellin(a);
        if(x==a)
        {
            System.out.println("The number is in pellindrome.");
        }
        else
        {
            System.out.println("The number is not in pellindrome.");
        }
    }
}