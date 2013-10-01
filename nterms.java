import java.io.*;
public class nterms

{
    public static void main(String arg[])throws IOException
{
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter a number");
    double n=Integer.parseInt(input.readLine());
    for(int i=1;i<=n;i++)
    {
     System.out.println(i+"\\");
    }
}
}