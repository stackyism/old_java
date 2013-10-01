import java.io.*;
public class Reverse
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any no. to be reversed");
        int n=Integer.parseInt(input.readLine());
        int sum=0,a=1;
        while(n!=0)
        {
            a=n%10;
            sum=(sum*10)+a;
            n=n/10;
        }
        System.out.println("The reverse of no. is: "+sum);
    }
}
        