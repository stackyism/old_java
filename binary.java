import java.io.*;
public class binary
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter the no. of elements wanted");
        int n=Integer.parseInt(input.readLine());
        
        System.out.println("Enter "+n+" elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(input.readLine());
        }
        //logic for sorting
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The sorted array is:-->   ");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        
        //logic for binary search
        
        System.out.println("Enter the element to be searched");
        int search=Integer.parseInt(input.readLine());
        
        int low=0,high=n-1,mid=0,k=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(a[mid]==search)
            {
                k=1;
                int copy=mid;
                break;
            }
            else
            {
                if(search>a[mid])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }   
        }
        if(k==1)
        {
            System.out.println("Element found ");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}