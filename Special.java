import java.io.*;
public class Special
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int n=Integer.parseInt(input.readLine());
        double sum=0,f=1;
        int n1=n;
        while(n!=0)
        {
            int a=n%10;
            for(int i=1;i<=a;i++)
            {
                f*=i;
            }
            sum=sum+f;
            n=n/10;
            f=1;
        }
        if(sum==n1)
        System.out.println("Yes, it is Special no.");
        else
        System.out.println("No, this is not a special no.");
    }
}
            