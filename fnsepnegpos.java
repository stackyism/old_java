import java.io.*;
public class fnsepnegpos
{
    public void neg(int a)
    {
        if(a<0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("The number is not negative");
        }
    }
    public void pos(int a)
    {
        if(a>0)
        {
            System.out.println("The number is positive");
        }
        else
        {
            System.out.println("the number is not positive");
        }
    }
    public void zero(int a)
    {
        if(a==0)
        {
            System.out.println("The number is non-positive and non-negative");
        }
        else
        {
            System.out.println("The number is not non-positive and non-negative");
        }
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any number");
        int n=Integer.parseInt(input.readLine());
        
        
        System.out.println("Enter 1 for checking negative");
        System.out.println("Enter 2 for checking positive");
        System.out.println("Enter 3 for checking non-positive and non-negative");
        int x=Integer.parseInt(input.readLine());
        fnsepnegpos h=new fnsepnegpos();
        switch(x)
        {
            case 1:
            {
                h.neg(n);
                break;
            }
            case 2:
            {
                h.pos(n);
                break;
            }
            case 3:
            {
                h.zero(n);
                break;
            }
        }
    }
}