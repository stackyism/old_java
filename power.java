import java.io.*;
public class power

{
    public static void main(String arg[])throws IOException
{
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter the no.");
    int x=Integer.parseInt(input.readLine());
    System.out.println("Enter the power of no.");
    int n=Integer.parseInt(input.readLine());
    double sum=1;
    for(int i=1;i<n;i++)
    {
       sum=sum+Math.pow(x,i);
    }
    System.out.println("The answer is: "+sum);
}
}