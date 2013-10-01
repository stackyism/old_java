import java.io.*;
public class allval
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any 10 numbers");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(input.readLine());
        }
        for(int i=0;i<10;i++)
        {
            System.out.println("The value no. "+(i+1)+" is-->  "+a[i]);
        }
    }
}