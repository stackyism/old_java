//Is the no. entered by user is divisible by 5 or not. 
import java.io.*;
public class divisible

{
    public static void main(String arg[])throws IOException
    {
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter Any NO.");
    double a=Double.parseDouble(input.readLine());
    double div=a/5;
    if(a%5==0)
    System.out.println("The number is divisible by 5 completely: "+div);
    else
    System.out.println("The number is not divisible by 5 completely so decimal division is: "+div);
   
}
}