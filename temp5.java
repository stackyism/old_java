import java.io.*;
public class temp5
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter the name of 5 cities");
        String n[]=new String[5];
        for(int i=0;i<5;i++)
        {
            n[i]=input.readLine();
        }
        System.out.println("Enter the temprature of these cities respectively");
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=Integer.parseInt(input.readLine());
        }
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println("The temprature of "+n[i]+" is -->  "+a[i]);
        }
    }
}
            