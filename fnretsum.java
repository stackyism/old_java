import java.io.*;
public class fnretsum
{
    public double retsum(double a,double b)
    {
        double sum=a+b;
        return sum;
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any two nos.");
        double a=Double.parseDouble(input.readLine());
        double b=Double.parseDouble(input.readLine());
        fnretsum h=new fnretsum();
        double x=h.retsum(a,b);
        System.out.println("Th sum of two nos. is:-->  "+x);
    }
}