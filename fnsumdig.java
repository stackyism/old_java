import java.io.*;
public class fnsumdig
{
    public void sumdig(int a)
    {
        int sum=0;
        while(a!=0)
        {
            int n=a%10;
            sum=sum+n;
            a=a/10;
        }
        System.out.println("The sum of digits of no. is:-->  "+sum);
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        fnsumdig h=new fnsumdig();
        h.sumdig(a);
    }
}