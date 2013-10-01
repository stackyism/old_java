import java.io.*;
public class magicbox
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
        System.out.println("The matrix is:-->  ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        
        int row[]=new int[3];
        int col[]=new int[3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                row[i]=row[i]+a[i][j];
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                col[i]=col[i]+a[j][i];
            }
        }
        int sumd1=0,sumd2=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                {
                    sumd1=sumd1+a[i][j];
                }
                if(i+j==2)
                {
                    sumd2=sumd2+a[j][i];
                }
            }
        }
        int k=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if((row[i]==col[i])&&(sumd1==sumd2))
                {
                    k=1;
                }
            }
        }
        if(k==1)
        {
            System.out.println("Magic box");
        }
        else
        {
            System.out.println("Not a magic box");
        }
        System.out.println("The sum of each row, column and diagonals is:-->  "+sumd1);
    }
}


                