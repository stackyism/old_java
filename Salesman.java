import java.io.*;
public class Salesman
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        double sale1=0,sale2=0,sale3=0,sale4=0;
        String name[]=new String[10];
        int zone[]=new int[10];
        int sale[]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter name of salesman");
            name[i]=input.readLine();
            System.out.println("Enter zone no. of "+name[i]+" between 1 to 4:");
            zone[i]=Integer.parseInt(input.readLine());
            if(zone[i]==1)
            {
                System.out.println("Enter your sale");
                sale[i]=Integer.parseInt(input.readLine());
                sale1=sale1+sale[i];
            }
            else if(zone[i]==2)
            {
                System.out.println("Enter your sale");
                sale[i]=Integer.parseInt(input.readLine());
                sale2=sale2+sale[i];
            }
            else if(zone[i]==3)
            {
                System.out.println("Enter your sale");
                sale[i]=Integer.parseInt(input.readLine());
                sale3=sale3+sale[i];
            }
            else
            {
                System.out.println("Enter your sale");
                sale[i]=Integer.parseInt(input.readLine());
                sale4=sale4+sale[i];
            }
        }
                System.out.println("The sale for zone 1-->  Rs."+sale1);
                System.out.println("The sale for zone 2-->  Rs."+sale2);
                System.out.println("The sale for zone 3-->  Rs."+sale3);
                System.out.println("The sale for zone 4-->  Rs."+sale4);
    }
}
