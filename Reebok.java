import java.io.*;
public class Reebok
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any no.");
        int a=Integer.parseInt(input.readLine());
        double sum=0;
        for(int i=1;i<=a;i++)
        {
            if(i%2==0)
            {
                sum=sum-i;
            }
            else
            {
                sum=sum+i;
            }
        }
        System.out.println("The result is: "+sum);
    }
}