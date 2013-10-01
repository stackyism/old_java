import java.io.*;
public class bada
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any sentence");
        String S1=input.readLine();
        String S2=S1.toUpperCase();
        System.out.println(S2);
    }
}