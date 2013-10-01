import java.io.*;
public class constpellindrome
{
    double sum=0;
    int n;
    public constpellindrome(int n)
    {
        int n1=n;
        while(n!=0)
        {
            int a=n%10;
            sum=(sum*10)+a;
            n=n/10;
        }
            if(sum==n1)
            {
                System.out.println("The number is pellindrome");
            }
            else
            {
                System.out.println("The number is not pellindrome");
            }
        }
            public static void main(String arg[])throws IOException
            {
                InputStreamReader reader=new InputStreamReader(System.in);
                BufferedReader input=new BufferedReader(reader);
                System.out.println("Enter any number");
                int n=Integer.parseInt(input.readLine());
                constpellindrome c=new constpellindrome(n);
            }
}
        

    
        