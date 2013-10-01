import java.io.*;
public class board1
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any no. below or equal to thousand");
        int a=Integer.parseInt(input.readLine());
        
        String h="";
        if(a>1000)
        {
            System.out.println("OUT OF RANGE");
        }
        else
        {
            String s[]=new String[1000];
            s[1]="ONE";
            s[2]="TWO";
            s[3]="THREE";
            s[4]="FOUR";
            s[5]="FIVE";
            s[6]="SIX";
            s[7]="SEVEN";
            s[8]="EIGHT";
            s[9]="NINE";
            s[10]="TEN";
            
            s[11]="ELEVEN";
            s[12]="TWELVE";
            s[13]="THIRTEEN";
            s[14]="FOURTEEN";
            s[15]="FIFTEEN";
            s[16]="SIXTEEN";
            s[17]="SEVENTEEN";
            s[18]="EIGHTEEN";
            s[19]="NINETEEN";
            s[20]="TWENTY";
            
            s[30]="THIRTY";
            s[40]="FORTY";
            s[50]="FIFTY";
            s[60]="SIXTY";
            s[70]="SEVENTY";
            s[80]="EIGHTY";
            s[90]="NINTY";
            s[100]="HUNDRED";
            
            if(a<=10)
            {
                for(int i=1;i<=10;i++)
                {
                    if(a==i)
                    {
                        h=s[i];
                    }
                }
                System.out.println(h);
            }
            
            if((a>10)&&(a<=20))
            {
                for(int i=11;i<=20;i++)
                {
                    if(a==i)
                    {
                        h=s[i];
                    }
                }
                System.out.println(h);
                
            }
        }
    }
}
