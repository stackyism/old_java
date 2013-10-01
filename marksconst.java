import java.io.*;
public class marksconst
{
    public void marksconst(int a,int b,int c,int d,int e)
    {
        double percent=(a+b+c+d+e)/5;
        System.out.println("The student gets "+percent+" percentage in 5 subjects");
        if(percent>70)
        {
            System.out.println("The stdent gets 'A' grade");
        }
        else if((percent<70)&&(percent>40))
        {
            System.out.println("The student gets 'B' grade");
        }
        else
        {
            System.out.println("The student gets 'C' grade");
        }
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter the marks in English");
        int eng=Integer.parseInt(input.readLine());
        
        System.out.println("Enter the marks in Maths");
        int maths=Integer.parseInt(input.readLine());
        
        System.out.println("Enter marks in Physics");
        int phy=Integer.parseInt(input.readLine());
        
        System.out.println("Enter marks in Chemistry");
        int chem=Integer.parseInt(input.readLine());
        
        System.out.println("Enter marks in E.V.S");
        int evs=Integer.parseInt(input.readLine());
        
        marksconst m=new marksconst();
        m.marksconst(eng,maths,phy,chem,evs);
    }
}