package Inheritance.Student;

import java.io.*;
public class Application
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter First name");
        String fname=input.readLine();
        
        System.out.println("Enter last name");
        String lname=input.readLine();
        
        System.out.println("Enter Stream");
        String Stream=input.readLine();
        
        System.out.println("Enter Degree");
        String Degree=input.readLine();
        
    }
}
