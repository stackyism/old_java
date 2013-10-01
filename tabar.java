import java.io.*;
public class tabar
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter the no. of rows wanted");
        int n=Integer.parseInt(input.readLine());
        
        System.out.println("Enter the no. of columns wanted");
        int m=Integer.parseInt(input.readLine());
        int k=n*m;
        
        System.out.println("Enter "+k+" values");
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=Integer.parseInt(input.readLine());
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                /*System.out.println("");*/
                System.out.print(+a[i][j]+"    ");
                
            }
            System.out.println("");
            System.out.println("");
        }
    }
}
        
  

        