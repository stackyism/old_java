import java.io.*;
public class fnseppriper
{
    int cnt=0;
    public void sepprime(int a)
    {
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                cnt=cnt+1;
            }
        }
        if(cnt==0)
        {
            System.out.println("The number is prime");
        }
        else
        {
            System.out.println("The number is not prime");
        }
    }
    int sum=0;
    public void sepperfect(int a)
    {
        int a1=a;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==a1)
        {
            System.out.println("The number is perfect");
        }
        else
        {
            System.out.println("The number is not perfect");
        }
    }
    
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any number");
        int n=Integer.parseInt(input.readLine());
        
        
        System.out.println("Enter 1 for checking prime");
        System.out.println("Enter 2 for checking perfect");
        int x=Integer.parseInt(input.readLine());
        fnseppriper h=new fnseppriper();
        switch(x)
        {
            case 1:
            {
                h.sepprime(n);
                break;
            }
            case 2:
            {
                h.sepperfect(n);
                break;
            }
        }
    }
}