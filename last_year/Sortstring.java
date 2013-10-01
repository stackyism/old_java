package last_year;
import java.io.*;
public class Sortstring
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any String");
        String s=input.readLine();
        
        String sc=s+" ";
        
        int cnt=0;
        
        int len=sc.length();
        
        for(int i=0;i<len;i++)
        {
            char ch1=sc.charAt(i);
            if(ch1==' ')
            {
                cnt++;
            }
        }
        
        int size=cnt+1;
        
        int j=0;
        
        String a[]=new String[size];
        
        String st="";
        
        for(int i=0;i<len;i++)
        {
            char ch=sc.charAt(i);
            
            if(ch!=' ')
            {
                st=st+ch;
            }
            else
            {
                a[j]=st;
                st="";
                System.out.println(a[j]);
                j++;
                
            }
        }
        
        for(int i=0;i<size;i++)
        { 
            for(j=i+1;j<size;j++)
            { 
                if(a[i].compareTo(a[j]) < 0) 
                { 
                        String t = a[j]; 
                        a[j] = a[i]; 
                        a[i] = t; 
                }
            }
        }
        
        for(int i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
    }
}
        
            
                
            
        