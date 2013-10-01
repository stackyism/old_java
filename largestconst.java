import java.io.*;
public class largestconst
{
    public largestconst(double a,double b,double c,double d)
    {
        if((a>b)&&(a>c)&&(a>d))
        {
            System.out.println("a is the largest no. :--> "+a);
        }
        else if((b>c)&&(b>d))
        {
            System.out.println("b is the largest no. :--> "+b);
        }
        else if(c>d)
        {
            System.out.println("c is the largest no. :--> "+c);
        }
        else
        {
            System.out.println("d is The largest no. :--> "+d);
        }
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter the value of a");
        double n1=Double.parseDouble(input.readLine());
        
        System.out.println("Enter the value of b");
        double n2=Double.parseDouble(input.readLine());
        
        System.out.println("Enter the value of c");
        double n3=Double.parseDouble(input.readLine());
        
        System.out.println("Enter the value of d");
        double n4=Double.parseDouble(input.readLine());
        
        largestconst l=new largestconst(n1,n2,n3,n4);
    }
}
        