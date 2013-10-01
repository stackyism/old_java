import java.io.*;
public class fnsepevod
{
    public void even(int a)
    {
        if(a%2==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is not even");
        }
    }
    public void odd(int a)
    {
        if(a%2!=0)
        {
            System.out.println("The number is odd");
        }
        else
        {
            System.out.println("the number is not odd");
        }
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any number");
        int n=Integer.parseInt(input.readLine());
        
        
        System.out.println("Enter 1 for checking even");
        System.out.println("Enter 2 for checking odd");
        int x=Integer.parseInt(input.readLine());
        fnsepevod h=new fnsepevod();
        switch(x)
        {
            case 1:
            {
                h.even(n);
                break;
            }
            case 2:
            {
                h.odd(n);
                break;
            }
        }
    }
}