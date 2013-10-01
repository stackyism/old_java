import java.io.*;
public class addnum2
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter the no. to add all digits");
        int n=Integer.parseInt(input.readLine());
        double sum=0;
        do
        {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        while(n!=0);
        System.out.println("The addition of digits is: "+sum);
    }
}
            