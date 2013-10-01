import java.io.*;
public class addfrac
{
    public static void main(String arg[])throws IOException
{
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter any no.");
    double a=Double.parseDouble(input.readLine());
    double b=0,sum=0;
    for(int i=1;i<=a;i++)
    {
        double v=(double)1/i;
        sum=sum+v;
    }
    System.out.println("The result is:  "+sum);
}
}