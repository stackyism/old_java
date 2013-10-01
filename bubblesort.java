import java.io.*;
public class bubblesort
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter the number of elements wanted");
        int n=Integer.parseInt(input.readLine());
        
        System.out.println("Enter "+n+" elements");
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(input.readLine());
        }
        
        //logic for bubble sorting
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
        System.out.println();
        System.out.println("The sorted elements are:-->");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+"");
        }
    }
}
            