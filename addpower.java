import java.io.*;
public class addpower
{
    public static void main(String arg[])throws IOException
{
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter any no.");
    double n=Double.parseDouble(input.readLine());
    double x=2,sum=0;
    for(int i=1;i<=n;i+=2)
    {
        double b=Math.pow(x,i);
        double c=1/b;
        sum=sum+c;
    }
    System.out.println("The result is:  "+sum);
    
}
}
    