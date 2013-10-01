import java.io.*;
public class alphadd
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any alphabet");
        String x1=input.readLine();
        System.out.println("Enter another alphabet");
        String x2=input.readLine();
        String c=x1+x2;
        System.out.println("The sum of alphabets is: "+c);
    }
}
