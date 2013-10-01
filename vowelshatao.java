import java.io.*;
public class vowelshatao
{
    public static void main(String argp[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any sentence");
        String S1=input.readLine();
        
        System.out.println();
        
        String S2="";
        
        int len1=S1.length();
        
        for(int i=0;i<len1;i++)
        {
            char ch=S1.charAt(i);
            if((ch!='a')&&(ch!='e')&&(ch!='i')&&(ch!='o')&&(ch!='u')&&(ch!='A')&&(ch!='E')&&(ch!='I')&&(ch!='O')&&(ch!='U'))
            {
                S2=S2+ch;
            }
        }
        
        System.out.println("The new sentence after deletion of vowels is:-->   ");
        System.out.println();
        System.out.println(S2);
    }
}