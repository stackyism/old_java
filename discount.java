import java.io.*;
public class discount
{
    public static void main(String arg[])throws IOException
    {
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter the no. of things purchased-");
    double a=Double.parseDouble(input.readLine());
    System.out.println("Enter Amount of each thing:");
    double b=Double.parseDouble(input.readLine());
    {System.out.println("discount on total less than 500 is 5%");
        System.out.println("discount on total more than 500 less than 1000 is 7%");
            System.out.println("discount on total more than 1000 8%");}
    double c=a*b;
    double d=(c*5)/100;
    double e=(c*7)/100;
    double f=(c*8)/100;
    double g=c-d;
    double h=c-e;
    double i=c-f;
    if(c<=500)
    {System.out.println("Your total is: "+c);
        System.out.println("The discount is Rs."+d);
        System.out.println("The net amount is: "+g);}
    else if((c>500)&&(c<=1000))
    {System.out.println("Your total is: "+c);
        System.out.println("The discoubt is Rs."+e);
        System.out.println("Your total is: "+h);}
    else
    {System.out.println("Your total is: "+c);
        System.out.println("The discount is Rs."+f);
        System.out.println("Your total is: "+i);}
    System.out.println("Thank You");
}
}

