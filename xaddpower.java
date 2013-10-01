import java.io.*;
public class xaddpower
{
    public static void main(String arg[])throws IOException
{
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    double x=2,sum=0;
    for(int i=1;i<=10;i++)
    {
        double b=Math.pow(x,i);
        double a=(double)i/b;
        sum=a;
    }
    System.out.println("The result is: "+sum);
}
}