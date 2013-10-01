import java.io.*;
public class Levis
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any number");
        int a=Integer.parseInt(input.readLine());
        double sum=0;
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                sum+=j;
            }
        }
        System.out.println("The answer is: "+sum);
    }
}
                