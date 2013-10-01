import java.io.*;
public class fnsepdigfact
{
    public void sepdig(int a)
    {
        int sum=0;
        while(a!=0)
        {
            int n=a%10;
            sum=sum+n;
            a=a/10;
        }
        System.out.println("The sum of all digits is:-->  "+sum);
    }
    
    public void sepfact(int a)
    {
        int f=1;
        for(int i=1;i<=a;i++)
        {
            f=f*i;
        }
        System.out.println("The factorial of number is:-->  "+f);
    }
    
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any number");
        int n=Integer.parseInt(input.readLine());
        
        
        System.out.println("Enter 1 for sum of digits of number");
        System.out.println("Enter 2 for factorial of number");
        int x=Integer.parseInt(input.readLine());
        fnsepdigfact h=new fnsepdigfact();
        switch(x)
        {
            case 1:
            {
                h.sepdig(n);
                break;
            }
            case 2:
            {
                h.sepfact(n);
                break;
            }
        }
    }
}