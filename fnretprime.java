import java.io.*;
public class fnretprime
{
    public int retprime(int a)
    {
        int cnt=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                cnt=cnt+1;
            }
        }
        return cnt;
        
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        fnretprime h=new fnretprime();
        int x=h.retprime(a);
        if(x==0)
        {
            System.out.println("The number is prime.  ");
        }
        else
        {
            System.out.println("The number is not prime.");
        }
    }
}