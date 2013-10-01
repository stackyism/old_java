import java.io.*;
public class interchangeconst
{
    public void interchangeconst(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("The no. after interchanging is--->");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any value of a");
        int n1=Integer.parseInt(input.readLine());
        
        System.out.println("Enter any value of b");
        int n2=Integer.parseInt(input.readLine());
        
        interchangeconst b=new interchangeconst();
        b.interchangeconst(n1,n2);
    }
}
        