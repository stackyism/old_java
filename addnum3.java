import java.io.*;
public class addnum3
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any no. to add all digits");
        int n=Integer.parseInt(input.readLine());
        double sum=0;
        for(int i=1;i!=0;i++)
        {
            
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("The sum of digits is: "+sum);
    }
}