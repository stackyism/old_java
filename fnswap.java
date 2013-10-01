import java.io.*;
public class fnswap
{
    public void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping the values:-->");
        System.out.println("The number a is:-->  "+a);
        System.out.println("The number b is:-->  "+b);
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter value of a");
        int a=Integer.parseInt(input.readLine());
        System.out.println("Enter value of b");
        int b=Integer.parseInt(input.readLine());
        System.out.println();
        fnswap h=new fnswap();
        h.swap(a,b);
    }
}