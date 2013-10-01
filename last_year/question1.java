package last_year;

import java.io.*;
public class question1
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter sentences");
        
        String S1=input.readLine();
        
        
        int len=S1.length();
        int cnt=0;
        
        for(int i=0;i<len;i++)
        {
            char ch=S1.charAt(i);
            
            if(ch=='?'||ch=='.'||ch=='!'||ch==',')
            {
                cnt++;
            }
        }
        System.out.println(cnt);
        
        String arr[]=new String[cnt];
    }
}
                