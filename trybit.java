import java.io.*;
public class trybit
{
    public static void main(String arg[])throws IOException
    {
        int bitmask= 0x000F;
        int val=0x2222;
        System.out.println(val & bitmask);
    }
}