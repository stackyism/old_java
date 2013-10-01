import java.io.*;
public class Pellindrome2
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any no. which is same from both sides");
        int n=Integer.parseInt(input.readLine());
        int n1=n;
        int sum=0;
        do
        {
            int rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        while(n!=0);
        if(sum==n1)
        System.out.println("The no. is in pellindrome: "+n1);
        else
        System.out.println("The no. is not in pellindrome: "+n1);
    }
}