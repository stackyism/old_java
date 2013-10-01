import java.io.*;
public class purchase

{
    public static void main(String arg[])throws IOException
    {
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter the no. of gifts to be purchased-");
    double a=Double.parseDouble(input.readLine());
    System.out.println("Enter Amount of each gift:");
    double b=Double.parseDouble(input.readLine());
    double c=a*b;
    if(c<=299)
    System.out.println("You can't purchase anything");
    else if((c>=300)&&(c<=499))
    System.out.println("You can purchse Key Ring from RS."+c);
    else if((c>=500)&&(c<=1000))
    System.out.println("You can purchase Leather bag from RS."+c);
    else
    System.out.println("You can purchase Pocket Calculator from RS."+c);
    System.out.println("Thank You");
}
}
