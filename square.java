import java.io.*;
public class square
{
public static void main(String arg[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
System.out.println("Enter the side");
double l=Integer.parseInt(input.readLine());
double mul;
mul=(double)l*l;
System.out.println("The area of square is "+mul);
}
}