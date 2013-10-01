import java.io.*;
public class etoestrex
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any word or sentence");
        String S1=input.readLine();
        
        int len=S1.length();
        
        String S2="";
        
        for(int i=0;i<len;i++)
        {
            char ch=S1.charAt(i);
            
            if(ch=='e')
            {
                ch='*';
            }
            S2=S2+ch;
        }
        System.out.println();
        System.out.println(S2);
    }
}