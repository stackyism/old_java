import java.io.*;
public class maximum
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
                
        System.out.println("Enter any no.");
        int n=Integer.parseInt(input.readLine());
        
        int max=-10000;
        while(n!=0)
        {
            int a=n%10;
            if(max<a)
            {
                max=a;
            }
            n=n/10;
        }
        System.out.println("The maximum no is-->  "+max);
    }
}