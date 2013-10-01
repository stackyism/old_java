import java.io.*;
public class consthcflcm
{
    int a,b,c,d,i;
    public consthcflcm(int a, int b)
    {
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
    public static void main(String args[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any 2 nos. for hcf and lcm");
        int a=Integer.parseInt(input.readLine());
        int b=Integer.parseInt(input.readLine());
        consthcflcm c=new consthcflcm(a,b);
    }
}
            
            