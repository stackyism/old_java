import java.io.*;
public class salary
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter salary of 20 employees");
        int sal[]=new int[20];
        for(int i=0;i<20;i++)
        {
            sal[i]=Integer.parseInt(input.readLine());
        }
        int c=0;
        for(int i=0;i<20;i++)
        {
            if(sal[i]>50000)
            {
                c=c+1;
            }
        }
        System.out.println("Employees having salary more than 50000 are--> "+c);
    }
}
        