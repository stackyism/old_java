import java.io.*;
public class fnretrev
{
    public int retrev(int a)
    {
        int sum=0;
        while(a!=0)
        {
            int n=a%10;
            sum=(sum*10)+n;
            a=a/10;
        }
        return sum;
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        fnretrev h=new fnretrev();
        int x=h.retrev(a);
        System.out.println("The reversed number is:-->  "+x);
    }
}