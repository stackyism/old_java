import java.io.*;
public class matsqcu
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any 9 elements");
        int a[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=Integer.parseInt(input.readLine());
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("The matrix is:-->  ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"    ");
            }
            System.out.println();
        }
        
        //logic for squaring odd nos. and cube even numbers.
        
        int b[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[i][j]%2==0)
                {
                    b[i][j]=(a[i][j])*(a[i][j])*(a[i][j]);
                }
                if(a[i][j]%2!=0)
                {
                    b[i][j]=(a[i][j])*(a[i][j]);
                }
            }
        }
        //printing
        System.out.println("The new matrix is:-->  ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(b[i][j]+"  \t  ");
            }
            System.out.println();
        }
    }
}