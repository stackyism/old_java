import java.io.*;
public class evensum
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        double sum=0;
        System.out.println("Enter any number");
        int n=Integer.parseInt(input.readLine());
        
        while(n!=0)
        {
            int a=n%10;
            int b=a%2;
            n=n/10;
            if(b==0)
            {
                sum=sum+a;
            }
        }
        System.out.println("Sum-->  "+sum);
    }
}
        