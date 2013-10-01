
//To check whether you are Saagar or not?
import java.io.*;
public class Whoru 
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("What is your name");
        String a=input.readLine();
        if(a.equals("Saagar"))
        System.out.println("You are Welcomed");
        else
        System.out.println("$$$$$$$   WRONG ANSWER   $$$$$$$");
        System.out.println("Sorry.");
        System.out.println("Want to know answer, go to next program");
    }
}