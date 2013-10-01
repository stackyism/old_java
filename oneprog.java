import java.io.*;
public class oneprog
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter value of n");
        double n=Double.parseDouble(input.readLine());
        System.out.println("Enter any no. from 1 to 11");
        int a=Integer.parseInt(input.readLine());
        switch(a)
        
            {
                case 1:
                {
                    double sum=0;
                    for(int i=1;i<=n;i++)
                    {
                        sum=(double)sum+(i/i+1);
                    }
                    System.out.println("The result is: "+sum);
                }
        
                break;
        
            case 2:
                {
                    double sum=0;
                    for(int i=1;i<=n;i++)
                    {
                        sum=(double)sum+(1/i);
                    }
                    System.out.println("The result is: "+sum);
                }
                break;
        
            case 3:
                {
                    double sum=0;
                    for(int i=1;i<=n;i++)
                    {
                        sum=(double)sum+(1/i+2);
                    }
                    System.out.println("The result is: "+sum);
                }
                break;
        
            case 4:
                {
                    double sum=0;
                    for(int i=1;i<=n;i++)
                    {
                        sum=(double)sum+(i/i+2);
                    }
                    System.out.println("The result is: "+sum);
                }
                break;
        
            case 5:
                {
                    double sum=0;
                    for(int i=1;i<=n;i++)
                    {
                        sum=(double)sum+(i/i+i);
                    }
                    System.out.println("The result is: "+sum);
                }
                break;
        
            case 6:
                {
                    double sum=0;
                    for(int i=1;i<=n;i++)
                    {
                        sum=(double)sum+(1/i+i);
                    }
                    System.out.println("The result is: "+sum);
                }
                break;
        
            case 7:
                {
                    double sum=0;
                    for(int i=1;i<=n;i++)
                    {
                        sum=(double)sum+i;
                    }
                    System.out.println("The result is: "+sum);
                }
                break;
        
            case 8:
                {
                    double sum=0;
                    for(int i=1;i<=n;i++)
                    {
                        double s=Math.pow(i,1);
                        double t=s+1;
                        sum=(double)sum+t;
                    }
                    System.out.println("The result is: "+sum);
                }
                break;
        
            case 9:
                {
                    double sum=0;
                    for(int i=1;i<=n;i++)
                    {
                        double f=Math.pow(i,1);
                        double g=f-1;
                        sum=(double)sum+g;
                    }
                    System.out.println("The result is: "+sum);
                }
                break;
        
            case 10:
                {
                    double sum=0;
                    for(int i=1;i<=n;i++)
                    {
                        double j=Math.pow(i,2);
                        sum=(double)sum+a;
                    }
                    System.out.println("The result is: "+sum);
                }
                break;
        
            case 11:
                {
                    double sum=0;
                    for(int i=1;i<=n;i++)
                    {
                        sum=(double)sum+(i+2);
                    }
                    System.out.println("The result is: "+sum);
                }
                break;
        
                default:
                System.out.println("The choice is wrong");
            }
        }
    }


