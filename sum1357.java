import java.io.*;
public class sum1357

{
    public static void main(String arg[])throws IOException
{
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter the no. upto which order 1,3,5... is added");
    int n=Integer.parseInt(input.readLine());
    double sum=0;
    for(int i=1;i<=n;i=i+2)
    {
       sum=sum+i;
    }
    System.out.println("The sum till no.of order 1,3,5..., is: "+sum);
}
}