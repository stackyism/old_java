import java.io.*;
public class area_circle
{
    public void area_circle(int r)
    {
        double areacir=3.14*(Math.pow(r,2));
        System.out.println("The area of circle is-->  "+areacir);
    }
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter the radius of circle for its area-->");
        int n=Integer.parseInt(input.readLine());
        area_circle c=new area_circle();
        c.area_circle(n);
    }
}