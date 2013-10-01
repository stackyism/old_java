import java.io.*;
public class Autmorphic
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any automorphic no.");
        int n=Integer.parseInt(input.readLine());
        
        int n1=n;
        int c=0;
        double e=n*n;
        
        System.out.println("The square is :-->   "+e);
        
        while(n1!=0)
        {
            c++;
            n1=n1/10;
        }
        double f=Math.pow(10,c);
        if(n==e%f)
        {
            System.out.println("The no. is automorphic");
        }
        else
        {
            System.out.println("The no. is not automorphic");
        }
    }
}
            