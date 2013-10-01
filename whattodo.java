//For non-Saagar users to get answer.
import java.io.*;
public class whattodo
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter Saagar instead of ur name ");
        String a=input.readLine();
        if(a.equals("Saagar"))
        System.out.println("You are Welcomed");
        else
        {
            System.out.println("You are a real fool");
            System.out.println("Next time enter Saagar");
        }
    }
}
