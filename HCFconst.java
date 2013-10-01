//To print HCF of two nos. entered by user.
import java.io.*;
public class HCFconst
{
    public void HCFconst(int a,int b)
    {
        int mul=a*b;
        int h=0;
        for(int i=1;i<=mul;i++)
        {
            if((a%i==0)&&(b%i==0))
            {
                h=i;
            }
        }
        System.out.println("The HCF of two nos. is:-->  "+h);
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
            
        System.out.println("Enter 1st no. for HCF");
        int n=Integer.parseInt(input.readLine());
            
        System.out.println("Enter 2nd. no. for HCF");
        int m=Integer.parseInt(input.readLine());
            
        HCFconst h=new HCFconst();
        h.HCFconst(n,m);
    }
}

        