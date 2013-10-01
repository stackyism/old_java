import java.io.*;
public class series
{
    public static void main(String arg[])throws IOException
    {
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter any no.");
    double n=Double.parseDouble(input.readLine());
    System.out.println("Enter any no. from 1 to 7");
    int a=Integer.parseInt(input.readLine());
    switch(a)    
    {
            case 1:
            {
                double f=1,sum=0;
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        f=f*j;
                        double b=1/f;
                        sum=sum+b;
                    }
                    f=1;
                }
                System.out.println("The answer is: "+sum);
             break;
            }
            case 2:
            {
                double f=1,sum=0;
                for(int i=1;i<=n;i++)
                {
                      for(int j=1;j<=i;j++)
                      { 
                          f=(double)f*j;
                          double b=i/f;
                          sum=sum+b;
                      }   
                       f=1;
                }
            System.out.println("The answer is: "+sum);
            break;
            }
            case 3:
            {
                double f=1,sum=0;
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        f=f*j;
                        double b=1/f;
                        sum=sum+b;
                    }
                    f=1;
                }
            System.out.println("The answer is: "+sum);
            break;
        }
            case 4:
            {
                System.out.println("Enter value of x");
                int x=Integer.parseInt(input.readLine());
                double f=1,sum=0;
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        f=f*j;
                        double s=i/f;
                        double b=Math.pow(x,s);
                        sum=sum+b;
                    }
                    f=1;
                }
            System.out.println("The answer is: "+sum);
            break;
        }
            default:
            System.out.println("Wrong choice");
            break;
        }
    }
}
            
    
        