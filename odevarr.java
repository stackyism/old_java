import java.io.*;
public class odevarr
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any 10 elements");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(input.readLine());
        }
        
        int b[]=new int[10];
        for(int i=0;i<10;i++)
        {
            b[i]=a[i];
        }
        
        int od=0,ev=0;
        for(int i=0;i<10;i++)
        {
            if(a[i]%2==0)
            {
                od=od+1;
            }
            else
            {
                ev=ev+1;
            }
        
        }
        
        int odd[]=new int[od];
        int even[]=new int[ev];
        
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<od;j++)
            {
                if(a[i]%2==0)
                {
                    odd[j]=a[i];
                }
            }
        }
        
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<ev;j++)
            {
                if(b[i]%2!=0)
                {
                    even[j]=b[i];
                }
            }
        }
        
        System.out.println("The odd array is:-->  ");
        for(int j=0;j<od;j++)
        {
            System.out.println(odd[j]);
        }
        System.out.println();
        System.out.println("The even array is:--> ");
        for(int j=0;j<ev;j++)
        {
            System.out.println(even[j]);
        }
    }
}
        