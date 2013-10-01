import java.io.*;
public class fnretsumdig
{
    public int retsumdig(int a)
    {
        int sum=0;
        while(a!=0)
        {
            int n=a%10;
            sum=sum+n;
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
        fnretsumdig h=new fnretsumdig();
        int x=h.retsumdig(a);
        System.out.println("The sum of all digits of number are:-->  "+x);
    }
}