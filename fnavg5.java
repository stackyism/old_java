import java.io.*;
public class fnavg5
{
    public void avg5(double sum)
    {
        double avg=sum/5;
        System.out.println("The average of 5 nos. is:-->  "+avg);
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any 5 nos.");
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=Integer.parseInt(input.readLine());
        }
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+a[i];
        }
        fnavg5 h=new fnavg5();
        h.avg5(sum);
    }
}