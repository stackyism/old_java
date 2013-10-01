package last_year;
import java.io.*;
public class kar
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any character");
        char c=(char)input.read();
        char nw='y';
        while(nw=='y')
        {
            int n=(char)c;
            System.out.println(n);
            System.out.println("do u want to continue??...");
            nw=(char)input.read();
        }
    }
}