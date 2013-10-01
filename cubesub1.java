import java.io.*;
public class cubesub1
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any no.");
        double n=Double.parseDouble(input.readLine());
        double sum=0,a=0;
        for(int i=1;i<=n;i++)
        {
            a=(double)Math.pow(i,3)-1;
            sum=sum+a;
        }
        System.out.println("The result is: "+sum);
    }
}