 
import java.io.*;
public class PRIME1
{
    public static void main(String arg[])throws IOEXception
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        
        System.out.println("Enter the number of lines to be entered in 't'");//to accept t.
        int t=Integer.parseInt(input.readLine());
        
        String a[]=new String[t];
        
        for(int i=0;i<t;i++)
        {
            System.out.println("Enter the value of m and n with space for line :"+(i+1));
            a[i]=input.readLine();
        }
        
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<=)