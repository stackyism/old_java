package last_year;
import java.io.*;
public class binary
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter size of an array");
        int n=Integer.parseInt(input.readLine());
        
        int ar[]=new int[n];
        
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++)
        {
            ar[i]=Integer.parseInt(input.readLine());
        }
        
        
        for(int i=0;i<n-1;i++)
        {
            if(ar[i]>ar[i+1]);
            {
                int temp=ar[i];
                ar[i]=ar[i+1];
                ar[i+1]=temp;
            }
        }
        
        //for binary search
        System.out.println("Enter the term to be searched");
        
        int search=Integer.parseInt(input.readLine());
        int low=0;
        int high=n-1;
        int k=0;
        int mid=(low+high)/2;
        while(low<=high)
        {
            
            
            if(search<ar[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
            if(search==ar[mid])
            {
                k=1;
            }
        }
         
            
        if(k==1)
        {
            System.out.println("Element found at "+(mid-1)+" and it is "+ar[mid]);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
    