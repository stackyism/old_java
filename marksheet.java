import java.io.*;
public class marksheet

{
    public static void main(String arg[])throws IOException
    {
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Name of Student");
    System.out.println("Roll no. of student");
    String a=input.readLine();
    double b=Double.parseDouble(input.readLine());
    System.out.println("Enter marks in Maths: ");
    System.out.println("Enter marks in English: ");
    System.out.println("Enter marks in Physics: ");
    System.out.println("Enter marks in Chemistry: ");
    System.out.println("Enter marks in Computer: ");
    double c=Double.parseDouble(input.readLine());
    double d=Double.parseDouble(input.readLine());
    double e=Double.parseDouble(input.readLine());
    double f=Double.parseDouble(input.readLine());
    double g=Double.parseDouble(input.readLine());
    double h=(c+d+e+f+g)/500*100;
    if(h>=90)
    System.out.println("The student gets Science with computer: "+h );
    else if((h<=89)&&(h>=80))
    System.out.println("The student gets Science without computer: "+h);
    else if((h<=79)&&(h>=70))
    System.out.println("The student gets Commerce with Maths: "+h);
    else
    System.out.println("The student gets Commerce without Maths "+h);
}
}
    
    