import java.io.*;
public class constperfect
{
    int n,n1=n;
    double sum=0;
    public constperfect(int n)
    {
        
        for(int i=1;1<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n1)
        {
            System.out.println("The number is perfect");
        }
        else
        {
            System.out.println("The number is not perfect");
        }
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any value");
        int n=Integer.parseInt(input.readLine());
        constperfect c=new constperfect(n);
    }
}
