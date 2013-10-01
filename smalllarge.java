import java.io.*;
public class smalllarge
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter the number of elements to be entered");
        int n=Integer.parseInt(input.readLine());
        
        System.out.println("Enter "+n+" elements");
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(input.readLine());
        }
        
        int small=a[0];
        int large=a[0];
        for(int i=0;i<n;i++)
        {
            if(small>a[i])
            {
                small=a[i];
            }
            if(large<a[i])
            {
                large=a[i];
            }
        }
        System.out.println("The samllest number is:-->  "+small);
        System.out.println("The largest number is:-->  "+large);
    }
}