import java.io.*;
public class Number
{
    private static long Num;
    
    public Number()
    {
        Num=0;
    }
    
    public Number(long n)
    {
        Num=n;
    }
    
    public static void digitfrequency()
    {
        long cnt=0,cnt1=0,cnt2=0,cnt3=0,cnt4=0,cnt5=0,cnt6=0,cnt7=0,cnt8=0,cnt9=0;
        long h=Num;
        while(h!=0)
        {
            long a=h%10;
            if(a==0)
            {
                cnt++;
            }
            else if(a==1)
            {
                cnt1++;
            }
            else if(a==2)
            {
                cnt2++;
            }
            else if(a==3)
            {
                cnt3++;
            }
            else if(a==4)
            {
                cnt4++;
            }
            else if(a==5)
            {
                cnt5++;
            }
            else if(a==6)
            {
                cnt6++;
            }
            else if(a==7)
            {
                cnt7++;
            }
            else if(a==8)
            {
                cnt8++;
            }
            else
            {   
                cnt9++;
            }
            h=h/10;
        }
        
        System.out.println("Total no. of 0's are:-->  "+cnt);
        System.out.println("Total no. of 1's are:-->  "+cnt1);
        System.out.println("Total no. of 2's are:-->  "+cnt2);
        System.out.println("Total no. of 3's are:-->  "+cnt3);
        System.out.println("Total no. of 4's are:-->  "+cnt4);
        System.out.println("Total no. of 5's are:-->  "+cnt5);
        System.out.println("Total no. of 6's are:-->  "+cnt6);
        System.out.println("Total no. of 7's are:-->  "+cnt7);
        System.out.println("Total no. of 8's are:-->  "+cnt8);
        System.out.println("Total no. of 9's are:-->  "+cnt9);
    }
    
    public static long sumDigit()
    {
        long sum=0;
        while(Num!=0)
        {
            long d=Num%10;
            sum=sum+d;
            Num=Num/10;
            
        }
        return sum;
    }
    
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        
        System.out.println("Enter any Number");
        long N=Long.parseLong(input.readLine());
        
        Number g=new Number(N);
        g.digitfrequency();
        long x=g.sumDigit();
        System.out.println("The sum of all digits is:-->  "+x);
    }
}
        