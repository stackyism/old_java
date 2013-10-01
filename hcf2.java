
/*
 * find hcf of 2 nos.
 * 
 * @author (Saagar Takhi) 
 * @version (a version number or a date)
 */
import java.io.*;
public class hcf2
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any no.");
        int a=Integer.parseInt(input.readLine());
        
        System.out.println("Enter another no.");
        int b=Integer.parseInt(input.readLine());
        
        int mul=0,hcf=0;
        mul=a*b;
        
        for(int i=1;i<=mul;i++)
        {
            if((a%i==0)&&(b%i==0))
            hcf=i;
        }
        System.out.println("The hcf of two nos. is: "+hcf);
    }
}
            