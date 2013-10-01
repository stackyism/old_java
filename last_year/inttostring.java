package last_year;
import java.io.*;
public class inttostring
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any no.");
        int x=Integer.parseInt(input.readLine());
        
        String news=Integer.toString(x);
        System.out.println(x);
        
        
        int len=news.length();
        
        String sn=news.substring(0,(len-2));
        
        int newint=Integer.valueOf(sn);
        System.out.println(newint);
    }
}
    