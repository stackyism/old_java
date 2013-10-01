//To find the sum till no. entered ny user.
import java.io.*;
public class sumn
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any value of n");
        int n=Integer.parseInt(input.readLine());
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("The addition till n is: "+sum);
    }
}