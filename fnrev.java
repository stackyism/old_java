import java.io.*;
public class fnrev
{
    public void rev(int a)
    {
        int sum=0;
        while(a!=0)
        {
            int n=a%10;
            sum=(sum*10)+n;
            a=a/10;
        }
        System.out.println("The reversed number is:-->  "+sum);
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        fnrev h=new fnrev();
        h.rev(a);
    }
}