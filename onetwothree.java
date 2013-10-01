import java.io.*;
public class onetwothree 
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        int a[][]=new int[3][4];
        
        for(int s=0;s<12;s++)
        {
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<4;j++)
                {
                    System.out.print((s+1)+"   ");
                }
            }
            System.out.println();
        }
    }
}