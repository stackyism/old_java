import java.io.*;
public class temprature
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter name of 10 cities");
        String name[]=new String[10];
        for(int i=0;i<10;i++)
        {
            name[i]=input.readLine();
        }
        System.out.println("Enter the temprature of these cities respectively");
        int temp[]=new int[10];
        for(int i=0;i<10;i++)
        {
            temp[i]=Integer.parseInt(input.readLine());
        }
        int max=temp[0],min=temp[0];
        String n1="",n2="";
        for(int i=0;i<10;i++)
        {
            if(max<temp[i])
            {
                max=temp[i];
                n1=name[i];
            }
            if(min>temp[i])
            {
                min=temp[i];
                n2=name[i];
            }
        }
        System.out.println("City '"+n1+"' has the maximum temprature-->  "+max);
        System.out.println("City '"+n2+"' has the minimum temprature-->  "+min);
    }
}
