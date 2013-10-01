//To add nos. in form (2/1 + 2/2 + 2/3 + 2/4 + 2/5...) till no. entered by user.
import java.io.*;
public class afracadd
{
    public static void main(String arg[])throws IOException
{
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    int a=2;
    double sum=0,b=0;
    for(int i=1;i<=10;i++)
    {
        b=(double)a/i;
        sum=sum+b;
    }
    System.out.println("The result is:  "+sum);
}
}