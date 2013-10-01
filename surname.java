import java.io.*;
public class surname
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter name of three words");
        String S1=input.readLine();
        
        String S2=S1.charAt(0)+".";
        
        int len=S1.length();
        
        int count=0;
        
        for(int i=1;i<len;i++)
        {
            char ch1=S1.charAt(i);
            if(ch1==' ')
            {
                count++;
                if(count==1)
                {
                    S2=S2+S1.charAt(i+1)+".";
                }
                if(count==2)
                {
                    S2=S2+S1.substring(i+1,len);
                }
            }
        }
        System.out.println();
        System.out.println("The short name is:-->     ");
        System.out.println(S2);
    }
}
                