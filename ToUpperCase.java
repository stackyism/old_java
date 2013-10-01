import java.io.*;
public class ToUpperCase
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any sentence in small letters");
        String S1=input.readLine();
        
        char ch=S1.charAt(0);
        char chx=Character.toUpperCase(ch);
        String S2="";
        S2=S2+chx;
        
        int len=S1.length();
        
        for(int i=1;i<len;i++)
        {
            char ch1=S1.charAt(i);
            S2=S2+ch1;
            if(ch1==' ')
            {
                char ch2=S1.charAt(i+1);
                char ch3=Character.toUpperCase(ch2);
                S2=S2+ch3;
                i=i+1;
            }
        }
        System.out.println();
        System.out.println("The new sentence is:-->   ");
        System.out.println(S2);
    }
}
   