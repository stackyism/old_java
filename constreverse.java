import java.io.*;
public class constreverse
{
    int sum=0;
    public constreverse(int n)
    {
        int n1=n;
        while(n!=0)
        {
            int rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        System.out.println("The reversed number is: "+sum);
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any value");
        int n=Integer.parseInt(input.readLine());
        constreverse c=new constreverse(n);
    }
}
            
        
        
