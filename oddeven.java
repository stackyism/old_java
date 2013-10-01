import java.io.*;
public class oddeven
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any number");
        int n=Integer.parseInt(input.readLine());
        
        double sum=0,sum1=0;
        System.out.println("Enter 1 for sum of all even digits");
        System.out.println("Enter 2 for sum of all odd digits");
        System.out.println("Enter 3 for sum of both even and odd digits");
        int x=Integer.parseInt(input.readLine());
        switch(x)
        {
            case 1:
            while(n!=0)
            {
                int a=n%10;
                int b=a%2;
                n=n/10;
                if(b==0)
                {
                    sum=sum+a;
                }
            }
            System.out.println("The sum of even digits is-->  "+sum);
            break;
            
            case 2:
            while(n!=0)
            {
                int a=n%10;
                int b=a%2;
                n=n/10;
                if(b!=0)
                {
                    sum=sum+a;
                }
            }
            System.out.println("The sum of odd digits is-->  "+sum);
            break;
            
            case 3:
            {
                while(n!=0)
                {
                    {
                        int a=n%10;
                        int b=a%2;
                        n=n/10;
                        if(b==0)
                        {
                            sum=sum+a;
                        }
                    }
                }
                System.out.println("The sum of even digits is-->  "+sum);
            }
            {
                while(n!=0)
                {
                    {
                        int a=n%10;
                        int b=a%2;
                        n=n/10;
                        if(b!=0)
                        {
                            sum1=sum1+a;
                        }
                    }
                        
                }
                System.out.println("The sum of odd digits is-->  "+sum1);
            }
        }
    }
}