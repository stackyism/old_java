import java.io.*;
public class sturank
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter the name of 20 students");
        String n[]=new String[20];
        for(int i=0;i<20;i++)
        {
            n[i]=input.readLine();
        }
        System.out.println("Enter the marks of these student respectively");
        int a[]=new int[20];
        for(int i=0;i<20;i++)
        {
            a[i]=Integer.parseInt(input.readLine());
        }
        
        for(int i=0;i<20;i++)
        {
            for(int j=i+1;j<20;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println("The student '"+n[i]+"' has got marks-->   "+a[i]);
        }
    }
}
                    