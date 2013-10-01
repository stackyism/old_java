import java.io.*;
public class constamstrong
{
    double sum=0;
    public constamstrong(int n)
    {
        int n1=n;
        while(n!=0)
        {
            int a=n%10;
            sum=sum+(Math.pow(a,3));
            n=n/10;
        }
        if(n1==sum)
        {
            System.out.println("The number is amstrong");
        }
        else
        {
            System.out.println("The number is not amstrong");
        }
    }
        public static void main(String arg[])throws IOException
            {
                InputStreamReader reader=new InputStreamReader(System.in);
                BufferedReader input=new BufferedReader(reader);
                System.out.println("Enter any value ");
                int n=Integer.parseInt(input.readLine());
                constamstrong c=new constamstrong(n);
            }
        }
    
    
    

            