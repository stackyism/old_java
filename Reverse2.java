import java.io.*;
public class Reverse2
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any no. to be reversed");
        int a=Integer.parseInt(input.readLine());
        int sum=0;
        do
        {
            int rem=a%10;
            sum=(sum*10)+rem;
            a=a/10;
        }
        while(a!=0);
        System.out.println("The reversed no. is: "+sum);
    }
}
            
        