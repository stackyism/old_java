import java.io.*;
public class Perfect
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int n=Integer.parseInt(input.readLine());
        double sum=0;
        int n1=n;
        {
            for(int i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    sum+=i;
                }
            }
        }
        if(sum==n1)
        System.out.println("The no. is perfect");
        else
        System.out.println("The no. is not Perfect");
    }
}