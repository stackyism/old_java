import java.io.*;
public class jamesBOND
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter name of two words");
        String S1=input.readLine();
        
        int len=S1.length();
        
        String S2="";
        int copy=0;
        
        for(int i=0;i<len;i++)
        {
            char ch=S1.charAt(i);
            S2=S2+ch;
            if(ch==' ')
            {
                copy=i+1;
                break;
            }
        }
        
        String S3=S1+" ";
        
        int len2=S3.length();
        
        for(int i=copy;i<len2;i++)
        {
            char ch1=S3.charAt(i);
            char ch2=Character.toUpperCase(ch1);
            S2=S2+ch2;
        }
        
        String S4=S2.trim();
        System.out.println(S4);
    }
}