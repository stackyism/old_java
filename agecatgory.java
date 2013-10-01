import java.io.*;
public class agecatgory
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter age of 20 employees ");
        int age[]=new int[20];
        int c1=0,c2=0,c3=0,c4=0,c5=0;
        for(int i=0;i<20;i++)
        {
            age[i]=Integer.parseInt(input.readLine());
        }
        for(int i=0;i<20;i++)
        {
            if(age[i]>=22&&age[i]<=30)
            {
                c1=c1+1;
            }
            else if(age[i]>=31&&age[i]<=40)
            {
                c2=c2+1;
            }
            else if(age[i]>=41&&age[i]<=50)
            {
                c3=c3+1;
            }
            else if(age[i]>=51&&age[i]<=60)
            {
                c4=c4+1;
            }
            else
            {
                c5=c5+1;
            }
        }
        System.out.println("There are '"+c1+"' employees between age 22 and 30");
        System.out.println("There are '"+c2+"' employees between age 31 and 40");
        System.out.println("There are '"+c3+"' employees between age 41 and 50");
        System.out.println("There are '"+c4+"' employees between age 51 and 60");
        System.out.println("There are '"+c5+"' employees above age 60");
    }
}