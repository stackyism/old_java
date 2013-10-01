import java.io.*;
public class fnseparmspe
{
    int cnt=0;
    public void separm(int a)
    {
        int sum=0;
        int a1=a;
        while(a!=0)
        {
            int n=a%10;
            sum=sum+(n*n*n);
            a=a/10;
        }
        if(sum==a1)
        {
            System.out.println("The number is amstrong");
        }
        else
        {
            System.out.println("The number is not amstrong");
        }
    }
    
    public void sepspe(int a)
    {
        int a1=a;
        int f=1,sum1=0;
        while(a!=0)
        {
            int n=a%10;
            for(int i=1;i<=n;i++)
            {
                f=f*i;
            }
            sum1=sum1+f;
            a=a/10;
            f=1;
        }
        if(sum1==a1)
        {
            System.out.println("The number is special");
        }
        else
        {
            System.out.println("The number is not special");
        }
    }
    
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any number");
        int n=Integer.parseInt(input.readLine());
        
        
        System.out.println("Enter 1 for checking amstrong");
        System.out.println("Enter 2 for checking special");
        int x=Integer.parseInt(input.readLine());
        fnseparmspe h=new fnseparmspe();
        switch(x)
        {
            case 1:
            {
                h.separm(n);
                break;
            }
            case 2:
            {
                h.sepspe(n);
                break;
            }
        }
    }
}