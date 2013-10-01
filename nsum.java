import java.io.*;
public class nsum

{
    public static void main(String arg[])throws IOException
{
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter no. of terms to be added");
    int n=Integer.parseInt(input.readLine());
    int sum=0;
    for(int i=1;i<=n;i++)
    {
        sum=sum+i;
    }
    System.out.println("The sum till entered digit is: "+sum);
}
}