import java.io.*;
public class maxcomp
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter the names of 10 students");
        String n[]=new String[10];
        for(int i=0;i<10;i++)
        {
            n[i]=input.readLine();
        }
        System.out.println("Enter their total marks in computer application");
        int mar[]=new int[10];
        for(int i=0;i<10;i++)
        {
            mar[i]=Integer.parseInt(input.readLine());
        }
        int max=mar[0],min=mar[0];
        String n1="",n2="";
        for(int i=0;i<10;i++)
        {
            if(max<mar[i])
            {
                max=mar[i];
                n1=n[i];
            }
            if(min>mar[i])
            {
                min=mar[i];
                n2=n[i];
            }
        }
        System.out.println("The student '"+n1+"' gets the maximum marks-->  "+max);
        System.out.println("The student '"+n2+"' gets the maximum marks-->  "+min);
    }
}