import java.io.*;
public class plus
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any number a");
        int a=Integer.parseInt(input.readLine());
        
        System.out.println("Enter any number b");
        int b=Integer.parseInt(input.readLine());
        
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        
        System.out.println("The sum is:-->  "+sum);
        System.out.println("The subtraction is:-->  "+sub);
        System.out.println("The multiplication is:-->  "+mul);
        System.out.println("The division is:-->  "+div);
    }
}
       