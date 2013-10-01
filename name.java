import java.io.*;
public class name
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        
        System.out.println("Enter you complete name");
        String name=input.readLine();
        
        System.out.println();
        System.out.println(name);
        
        System.out.println();
        System.out.println("New name is:");
        
        char s1=name.charAt(0);
        int len=name.length();
        System.out.println(len);
        int copy=0;
        String s2="";
        for(int i=0;i<len;i++)
        {
            char c=name.charAt(i);
            if(c==' ')
            {
                copy=i+1;
                break;
            }
        }
        for(int i=copy;i<len;i++)
        {
            char ch=name.charAt(i);
            s2=s2+ch;
        }
        s1=Character.toUpperCase(s1);
        System.out.println(s2+", "+s1);
    }
}
        