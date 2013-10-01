import java.io.*;
public class grade
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter name of student");
        String name=input.readLine();
        System.out.println("Enter his marks in 11 subjects");
        int m[]=new int[11];
        for(int i=0;i<11;i++)
        {
            m[i]=Integer.parseInt(input.readLine());
        }
        double sum=0,total=0;
        for(int i=0;i<11;i++)
        {
            sum=sum+m[i];
            total=sum/11;
        }
        if(total<50)
        {
            System.out.println("The student gets 'D' grade with '"+total+"' percentage.");
        }
        else if(total>=50&&total<60)
        {
            System.out.println("The student '"+name+"' gets 'C' grade with '"+total+"' percentage.");
        }
        else if(total>=60&&total<80)
        {
            System.out.println("The student gets 'B' grade with '"+total+"' percentage.");
        }
        else
        {
            System.out.println("The student gets 'A' grade with '"+total+"' percentage.");
        }
    }
}
      