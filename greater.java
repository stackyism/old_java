import java.io.*;
public class greater

{
    public static void main(String arg[])throws IOException
    {
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter value of a, b and c");
    double a=Double.parseDouble(input.readLine());
    double b=Double.parseDouble(input.readLine());
    double c=Double.parseDouble(input.readLine());
    if((a>b)&&(a>c))
    System.out.println("a is greatest: "+a);
    else if(b>c)
    System.out.println("b is greatest: "+b);
    else
    System.out.println("c is greatese: "+c);
}
}
    