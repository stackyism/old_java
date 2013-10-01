import java.io.*;
public class Helloworld
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any name");
        String a=input.readLine();
        System.out.println("Enter another name");
        String b=input.readLine();
        System.out.println("The sum of Names is: "+(a+b));
        System.out.println("The length of 1st name is: "+a.length());
        System.out.println("The chacters in 1st name at 3 is: "+a.charAt(2));
        System.out.println("Is "+a+"="+b+": "+a.equals(b));
        System.out.println("The length of 2nd name is: "+b.length());
        System.out.println("The chacters in 2nd name at 3 is: "+b.charAt(2));
    }
}

        