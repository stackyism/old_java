import java.io.*;
public class fnsum
{
    public void all(int a,int b)
    {
        int sum=a+b;
        System.out.println("The sum of 2 nos. is:-->  "+sum);
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter");
        int a=Integer.parseInt(input.readLine());
        int b=Integer.parseInt(input.readLine());
        fnsum h=new fnsum();
        h.all(a,b);
    }
}