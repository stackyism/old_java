import java.io.*;
public class sumar
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        int a[]=new int[5];
        int sum=0;
        
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the number");
            a[i]=Integer.parseInt(input.readLine());
        }
        
        for(int i=0;i<5;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("The total is:-->"+sum);
    }
}