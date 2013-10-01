import java.io.*;
public class bubble
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
        for(int i=0;i<(n-1);i++)
        {
            if(a[i]>a[(i+1)])
            {
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        System.out.println("The sorted array is:--> ");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
                    
            