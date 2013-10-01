import java.io.*;
public class fnpellin
{
    public void pellin(int a)
    {
        int a1=a;
        int sum=0;
        while(a!=0)
        {
            int n=a%10;
            sum=(sum*10)+n;
            a=a/10;
        }
        if(sum==a1)
        {
            System.out.println("The number is in pellindrome.");
        }
        else
        {
            System.out.println("The number is not in pellindrome.");
        }
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        fnpellin h=new fnpellin();
        h.pellin(a);
    }
}