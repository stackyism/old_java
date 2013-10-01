import java.io.*;
public class avg
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
            double a=(n%10);
            double avg=a/2;
            System.out.println("The average of "+a+" is-->  "+avg);
            n=n/10;
        }
    }
}
    