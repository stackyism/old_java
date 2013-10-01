/** This program considers all months to be of 30 days 
* and year for 365 days so age is slightly not perfect, you may improvise further, 
* also note that it takes month arguements in integer form.
*/
import java.io.*;
public class agecalc
{
public static void main(String args[])throws IOException
{
InputStreamReader read = new InputStreamReader (System.in);
BufferedReader in = new BufferedReader (read);

System.out.println("Enter You birth day:");
int day=Integer.parseInt(in.readLine());
System.out.println("Enter Birth month:"); 
int mth = Integer.parseInt(in.readLine());
System.out.println("Enter birth year:");
int yr = Integer.parseInt(in.readLine());
System.out.println("______________________________________");
System.out.println("Enter 2day's day:");
int tday= Integer.parseInt(in.readLine());
System.out.println("Enter 2day's month:");
int tmth = Integer.parseInt(in.readLine());
System.out.println("Enter present year :");
int tyr = Integer.parseInt(in.readLine());
int fmth = 0;
int aday =0;
if(tday>day)
{
aday=tday-day;
}
else
{
aday=day-tday;
}
if(tmth>mth)
{
fmth = tmth-mth;
}
else
{
int temp=mth-tmth;
fmth = 12-temp;
}
int amth=(30*fmth)-aday;
int ayr=0;
if(tmth<mth)
{
ayr=tyr-yr-1;
}
else
{
ayr =tyr-yr;
}
System.out.println("Age in years = " +ayr);
System.out.println("Age in months = " + fmth);
System.out.println("Age in days = " + aday);
}
}