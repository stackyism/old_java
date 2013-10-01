import java.io.*;
public class adconst
{
    public static void adconst(double a,double b)
    {
        double sum;
        sum=a+b;
        System.out.println("The sum of two nos. is: "+sum);
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter first no.");
        String n1=input.readLine();
        double m1=Double.parseDouble(n1);
        System.out.println("Enter another no. ");
        String n2=input.readLine();
        double m2=Double.parseDouble(n2);
        adconst c=new adconst();
        c.adconst(m1,m2);
    }
}
        