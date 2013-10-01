//To determine the larger no. entered by user.
import java.io.*;
public class larger
{
  public static void main(String arg[])throws IOException
  {
  InputStreamReader reader=new InputStreamReader(System.in);
  BufferedReader input=new BufferedReader(reader);
  System.out.println("Enter 'm' and 'n':-");
  int m=Integer.parseInt(input.readLine());
  int n=Integer.parseInt(input.readLine());
  
  if(m>n)
  System.out.println("m is larger" +m);
  else
  System.out.println("n is larger" +n);
}
}
