import java.io.*;
public class Amstrong
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int n=Integer.parseInt(input.readLine());
        double sum=0;
        int n1=n;
        while(n!=0)
        {
            int a=n%10;
            sum=sum+Math.pow(a,3);
            n=n/10;
        }
        if(sum==n1)
        System.out.println("The number is Amstrong");
        else
        System.out.println("The number is not an Amstrong");
    }
}
        