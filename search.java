import java.io.*;
public class search
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter the number of elements wanted");
        int n=Integer.parseInt(input.readLine());
        
        System.out.println("\t\tEnter "+n+" elements");
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(input.readLine());
        }
        
        System.out.println("Enter the element to be searched");
        int search=Integer.parseInt(input.readLine());
        
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(search==a[i])
            {
                k=1;
            }
        }
        if(k!=0)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
                