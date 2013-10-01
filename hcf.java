import java.io.*;
public class hcf
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any 2 nos. to find its HCF");
        int a=Integer.parseInt(input.readLine());
        int b=Integer.parseInt(input.readLine());
        
        if(a>b)
        {
            a=a;
            b=b;
        }
        else
        {
            int temp=a;
            a=b;
            b=temp;
        }
        for(int i=b;i>0;i--)
        {
            if((a%i==0)&&(b%i==0))
            {
                int c=a*b;
                int d=c/i;
                System.out.println("The HCF of "+a+" and "+b+" is: "+i);
                System.out.println("The LCM of "+a+" and "+b+" is: "+d);
            }
            break;
        }
    }
}
        