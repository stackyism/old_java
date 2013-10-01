import java.io.*;
public class fnprime
{
    public void prime(int a)
    {
        int cnt=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                cnt=cnt+1;
            }
        }
        if(cnt==0)
        {
            System.out.println("The number is prime.  ");
        }
        else
        {
            System.out.println("The number is not prime.");
        }
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        fnprime h=new fnprime();
        h.prime(a);
    }
}