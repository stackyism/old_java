import java.io.*;
public class sumsq
{
    public static void main(String arg[])throws IOException
{
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enetr the no.");
    double a=Double.parseDouble(input.readLine());
    double sum=0;
    for(int i=1;i<=a;i++)
    {
        double b=(i*i)-1;
        sum=sum+b;
    }
    System.out.println("The result is:- "+sum);
}}

    