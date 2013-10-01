import java.io.*;
public class marksarr
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);;
        BufferedReader input=new BufferedReader(reader);
        
        int stuarray[]={95,88,56,78,55};
        int max=stuarray[0];
        int min=stuarray[0];
        
        for(int i=0;i<5;i++)
        {
            if(max<stuarray[i])
            {
                max=stuarray[i];
            }
            if(min>stuarray[i])
            {
                min=stuarray[i];
            }
        }
        System.out.println("The maximum marks are-->  "+max);
        System.out.println("The minimum marks are-->  "+min);
    }
}
                
        