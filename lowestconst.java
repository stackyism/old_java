import java.io.*;
public class lowestconst
{
    public lowestconst(double a,double b,double c,double d)
    {
        if((a<b)&&(a<c)&&(a<d))
        {
            System.out.println("a is the smallest no. :--> "+a);
        }
        else if((b<c)&&(b<d))
        {
            System.out.println("b is the smallest no. :--> "+b);
        }
        else if(c<d)
        {
            System.out.println("c is the smallest no. :--> "+c);
        }
        else
        {
            System.out.println("d is The smallest no. :--> "+d);
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
        
        lowestconst l=new lowestconst(n1,n2,n3,n4);
    }
}
        