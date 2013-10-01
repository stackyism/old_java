import java.io.*;
public class fnsepcalc
{
    public void sum(int a,int b)
    {
        int sum=a+b;
        System.out.println("The sum of 2 nos. is:--> "+sum);
    }
    public void sub(int a,int b)
    {
        int sub=a-b;
        System.out.println("The subtraction of 2 nos. is:-->  "+sub);
    }
    public void mul(int a,int b)
    {
        int mul=a*b;
        System.out.println("The multiplication of 2 nos. is:--> "+mul);
    }
    public void div(double a,double b)
    {
        double div=a/b;
        System.out.println("The division of 2 nos. is:--> "+div);
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        
        System.out.println("Enter another number");
        int b=Integer.parseInt(input.readLine());
        
        fnsepcalc h=new fnsepcalc();
        h.sum(a,b);
        h.sub(a,b);
        h.mul(a,b);
        h.div(a,b);
    }
}