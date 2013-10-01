package last_year;
import java.io.*;
public class length
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter sentence in lower case with full stop in end");
        
        String s=input.readLine();
        
        String s1=s;
        
        int len=s1.length();
        
        int cnt=0;
        
        for(int i=0;i<len;i++)
        {
            char ch1=s1.charAt(i);
            if(ch1==' ')
            {
                cnt++;
            }
        }
        System.out.println(cnt+1);
        
        String st="";
        int j=0;
        
        String a[]=new String[cnt+1];
        
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            
            if(ch!=' '&&ch!='.')
            {
                st=st+ch;
            }
            else
            {
                a[j]=st;
                st="";
                //System.out.println(a[j]);
                j++;
                
            }
        }
        /*for(int i=0;i<cnt;i++)
        {
            if((a[i].length())<(a[i+1].length()))
            {
                System.out.println("a[i]"+a[i].length()+"    a[i+1]"+a[i+1].length());
                String temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }*/
        
        
        int x=0;
        int y=0;
        
        for(int i=0;i<cnt+1;i++)
        {
            System.out.print(a[i]+" ");
        } 
        
        System.out.println();
        for(int i=0;i<cnt;i++)
        {
            for(j=0;j<cnt;j++)
            {
                x=a[j].length();
                y=a[j+1].length();
            
                if(x>y)
                {
                    String temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                x=0;
                y=0;
            }
        }
        
        System.out.println("\n");
        for(int i=0;i<cnt+1;i++)
        {
            System.out.print(a[i]+" ");
        }
            
    }
}
    