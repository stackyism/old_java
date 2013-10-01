import java.io.*;
public class adidas
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any no.");
        int n=Integer.parseInt(input.readLine());
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            double c=Math.pow(2,i);
            double b=(double)1/c;
            sum=sum+b;
        }
        System.out.println("The result is  "+sum);
    }
}
    