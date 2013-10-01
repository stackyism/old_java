import java.io.*;
public class greatest

{
   public static void main(String arg[])throws IOException
    {
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter value of a, b, c and d");
    double a=Double.parseDouble(input.readLine());
    double b=Double.parseDouble(input.readLine());
    double c=Double.parseDouble(input.readLine());
    double d=Double.parseDouble(input.readLine());
    if((a>b)&&(a>c)&&(a>d))
    System.out.println("a is greatest: "+a);
    else if((b>c)&&(b>d))
    System.out.println("b is greatest: "+b);
    else if((c>d))
    System.out.println("c is greatest: "+c);
    else
    System.out.println("d is greatest: "+d);
}
}
    
    