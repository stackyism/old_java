import java.io.*;
public class result
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter marks in English");
        int en=Integer.parseInt(input.readLine());
        
        System.out.println("Enter marks in chemistry");
        int chem=Integer.parseInt(input.readLine());
        
        System.out.println("Enter marks in physics");
        int phy=Integer.parseInt(input.readLine());
        
        System.out.println("Enter marks in EEd. ");
        int ed=Integer.parseInt(input.readLine());
        
        System.out.println("Enter marks in maths");
        int mth=Integer.parseInt(input.readLine());
        
        System.out.println("Enter marks in computer");
        int comp=Integer.parseInt(input.readLine());
        
        int total=en+chem+phy+ed+mth+comp;
        double per=total/6;
        
        System.out.println("total:-- " +total);
        System.out.println("percentage :-- " +per);
    }
}