import java.io.*;
public class addnum
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any no. to add all digits");
        int a=Integer.parseInt(input.readLine());
        double sum=0;
        while(a!=0)
        {
            int rem=a%10;
            sum=sum+rem;
            a=a/10;
        }
        System.out.println("The sum of digits is: "+sum);
    }
}