import java.io.*;
public class calculator
{
    public static void main(String arg[])throws IOException
{
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter any no.");
    double a=Double.parseDouble(input.readLine());
    System.out.println("Enter another no.");
    double b=Double.parseDouble(input.readLine());
    double c=a+b,d=a-b,e=a*b,f=a/b,g=b%a;
    System.out.println("The addition is: "+c);
        System.out.println("The subtraction is: "+d);
            System.out.println("The multiplication is: "+e);
                System.out.println("The division is: "+f);
                    System.out.println("The Remainder is: "+g);
                }
            }