import java.io.*;
public class choice 
{
    public static void main(String arg[])throws IOException
{
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("Enter any no. from 1 to 7");
    int a=Integer.parseInt(input.readLine());
    switch(a)
    {
        case 1:
        System.out.println("Today is monday");
        break;
        
        case 2:
        System.out.println("Today is Tuesday");
        break;
        
        case 3:
        System.out.println("Today is Wednesday");
        break;
        
        case 4:
        System.out.println("Today is Thursday");
        break;
        
        case 5:
        System.out.println("Today is Friday");
        break;
        
        case 6:
        System.out.println("Today is Saturday");
        break;
        
        case 7:
        System.out.println("Today is Sunday");
        break;
        
        default:
        System.out.println("Wrong Choice");
        break;
    }
}
}
        