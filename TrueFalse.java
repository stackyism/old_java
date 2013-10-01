import java.io.*;
public class TrueFalse 
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter values for a and b where a>b");
        int a=Integer.parseInt(input.readLine());
        int b=Integer.parseInt(input.readLine());
        double c=(a>b)?1:0;
        System.out.println("The answer is: "+c);
    }
}