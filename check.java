import java.io.*;
public class check

{
    public static void main(String arg[])throws IOException
    {
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter Any NO.");
    double a=Integer.parseInt(input.readLine());
    if(a>0)
    System.out.println("The number is positive: "+a);
    else
    System.out.println("The number is negative: "+a);
}
}