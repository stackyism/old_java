import java.io.*;
public class country
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        
        System.out.println("Enter the number of countries to be entered");
        int n=Integer.parseInt(input.readLine());
        
        String coun[]=new String[n];
        String city[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name of country");
            coun[i]=input.readLine();
            System.out.println("Enter the name of corresponding city");
            city[i]=input.readLine();
        }
        
        
        System.out.println();
        System.out.println("Enter the name of any country");
        String search=input.readLine();
        
        String c="";
        for(int i=0;i<n;i++)
        {
            if(search==coun[i])
            {
                c=city[i];
            }
        }

    }
}