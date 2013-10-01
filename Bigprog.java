import java.io.*;
public class Bigprog
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any no.from 1 to 6");
        int z=Integer.parseInt(input.readLine());
        double sum=0,f=1,b;
        switch(z)
        {
            case 1:
            {
                System.out.println("Enter the value of n");
                double n=Double.parseDouble(input.readLine());
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        f*=j;
                    }
                    double h=1/f;
                    sum=sum+h;
                    f=1;
                }
                System.out.println("The answer is: "+sum);
                break;
            }
            case 2:
            {
                System.out.println("Enter the value of n");
                double n=Double.parseDouble(input.readLine());
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        f*=j;
                    }
                    double h=i/f;
                    sum=sum+h;
                    f=1;
                }
                System.out.println("The answer is: "+sum);
                break;
            }
            case 3:
            {
                System.out.println("Enter the value of x");
                double x=Double.parseDouble(input.readLine());
                for(int i=1;i<=x;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        f*=j;
                    }
                    double y=Math.pow(x,i);
                    double k=y/f;
                    sum+=k;
                    f=1;
                }
                System.out.println("The answer is: "+sum);
                break;
            }
            case 4:
            {
                System.out.println("Enter value of x");
                double x=Double.parseDouble(input.readLine());
                for(int i=1;i<=x;i+=2)
                {
                    for(int j=1;j<=i;j++)
                    {
                        f*=j;
                    }
                    double y=Math.pow(x,i);
                    double l=(double)y/f;
                    sum-=l;
                    f=1;
                }
                System.out.println("The answer is: "+sum);
                break;
            }
            case 5:
            {
                System.out.println("Enter value of x");
                double x=Double.parseDouble(input.readLine());
                for(int i=1;i<=x;i++)
                {
                    if(i%2==0)
                    {
                        for(int j=1;j<=i;j++)
                        {
                            f*=j;
                        }
                        double y=Math.pow(x,i);
                        double u=(double)y/f;
                        sum-=u;
                        f=1;
                    }
                        else
                        {
                            for(int j=1;j<=i;j++)
                            {
                                f*=j;
                            }
                            double y=Math.pow(x,i);
                            double t=(double)y/f;
                            sum-=t;
                            f=1;
                            System.out.println("The answer is: "+sum);
                            break;
                        }
                    }
                }
             case 6:
             {
                 for(int i=1;i<=10;i++)
                 {
                     sum+=(2/i);
                  }
                  System.out.println("The anserw is: "+sum);
                  break;
              }
              default:
              System.out.println("The choice is wrong");
            }
        }
    }
                  
                  
                 
                    
                
                
                
                
            
                