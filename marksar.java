import java.io.*;
public class marksar
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter marks 5 in subject");
        int n[]=new int[5];
        double sum=0,per=0;
        for(int i=0;i<5;i++)
        {
            
            n[i]=Integer.parseInt(input.readLine());
        }
        for(int i=0;i<5;i++)
        {
            sum=sum+n[i];
            
        }
        per=sum/5;
        System.out.println("Total marks in exams are:-->"+sum);
        System.out.println("Total percentage is:-->"+per);
    }
}