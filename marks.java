import java.io.*;
public class marks
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter your marks in Maths");
        double a=Double.parseDouble(input.readLine());
        System.out.println("Enter your marks in English");
        double b=Double.parseDouble(input.readLine());
        System.out.println("Enter your marks in Hindi");
        double c=Double.parseDouble(input.readLine());
        System.out.println("Enter your marks in Science");
        double d=Double.parseDouble(input.readLine());
        System.out.println("Enter your marks in Computer");
        double e=Double.parseDouble(input.readLine());
        double f=((a+b+c+d+e)/500)*100;
        System.out.println("Total percentage is: "+f);
        if(f<=35)
        System.out.println("You are fail");
        else if((f>35)&&(f<=65))
        System.out.println("You need to do hardwork");
        else if((f>65)&&(f<=90))
        System.out.println("You are good but not best");
        else
        System.out.println("You are excellent");
    }
}
        