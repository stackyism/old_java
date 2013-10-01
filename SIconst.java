//To find the SI of amt,rate and time entered by user.
import java.io.*;
public class SIconst
{
    public void SIconst(double p,int r,int t)
    {
        double SI=(p*r*t)/100;
        System.out.println("The Simple interest is:->  "+SI);
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter the Principle amount ");
        int a=Integer.parseInt(input.readLine());
        
        System.out.println("Enter the rate of interest");
        int b=Integer.parseInt(input.readLine());
        
        System.out.println("Enter the time period for interest");
        int c=Integer.parseInt(input.readLine());
        
        SIconst s=new SIconst();
        s.SIconst(a,b,c);
    }
}