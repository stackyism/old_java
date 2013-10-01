import java.io.*;
public class prall
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any number");
        int n=Integer.parseInt(input.readLine());
        double sum=0;
        while(n!=0)
        {
            int a=n%10;
            sum=sum+a;
            n=n/10;
        }
        System.out.println("The sum of all digits is-->  "+sum);
    }
}
    