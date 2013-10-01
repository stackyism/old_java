import java.io.*;
public class quiz
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        double total=0;
        
        System.out.println("                        WELCOME              ");
        System.out.println("                      TO THE QUIZ            ");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("INSTRUCTIONS:-");
        System.out.println("");
        System.out.println("i)The quiz contains 25 questions.");
        System.out.println("");
        System.out.println("ii)It contains three sections namely:-");
        System.out.println("    -> (Section-A):-> 10 Questions");
        System.out.println("    -> (Section-B):-> 10 Questions");
        System.out.println("    -> (Section-C):-> 05 Questions");
        System.out.println("");
        System.out.println("iii)-a)(Section-A):-");
        System.out.println("    -> Three marks for each correct answer and 1 negative for each wrong answer.");
        System.out.println("");
        System.out.println("    -b)(Section-B):-");
        System.out.println("    -> Four marks for each correct answer and 2 negative for each wrong answer.");
        System.out.println("");
        System.out.println("    c)(Section-C):-");
        System.out.println("    -> Six marks for each correct answer and 3 negative for each wrong answer.");
        System.out.println("");
        System.out.println("iv)All questions are multiple choice with only one correct answer.");
        System.out.println("");
        System.out.println("v)Time limit is 20 minutes.");
        System.out.println("");
        System.out.println("vi)Maximum marks:100");
        System.out.println("                  GO!..GO!..GO!");
        System.out.println("                  BEST OF LUCK  ");
        System.out.println("");
        System.out.println("");
        System.out.println("                    (SECTION-A)");
        System.out.println("");
        System.out.println("Q1)Who is the prime minister of India(current)?");
        System.out.println("   (a)Mr.Manmohan Singh                                 (b)Mr.Atal Bihari Vajpayee");
        System.out.println("   (c)Mr.P.Chidambaram                                  (d)Dr.Manmohan Singh");
        String x1=input.readLine();
        if(x1.equals("d"))
        {
            total=total+3;
            System.out.println("Your answer is correct. +"+3);
        }
        else
        {
            total=total-1;
            System.out.println("Your answer is Wrong.   -"+1);
        }
        System.out.println("");
        System.out.println("Q2)Who is currently trying to capture India's land on Border land of Northern India?");
        System.out.println("   (a)Pakistan                                        (b)China");
        System.out.println("   (c)Afghanistan                                     (d)America");
        String x2=input.readLine();
        if(x2.equals("b"))
        {
            total=total+3;
            System.out.println("Your answer is correct. +"+3);
        }
        else
        {
            total=total-1;
            System.out.println("Your answer is Wrong.  -"+1);
        }
        System.out.println("");
        System.out.println("Q3)What is the name of the terrorist, who was captured in Mumbai 26/11?");
        System.out.println("   In how many different ways can we obtain 5 heads and 5 tails:");
        System.out.println("   (a)Ajmal Amir Kasab                                   (b)Ismail Kasab");
        System.out.println("   (c)Lashkar ae Kasab                                   (d)Kabir Darbar");
        String x3=input.readLine();
        if(x3.equals("a"))
        {
            total+=3;
            System.out.println("Your answer is correct. +"+3);
        }
        else
        {
            total-=1;
            System.out.println("Your answer is Wrong.  -"+1);
        }
        System.out.println("");
        System.out.println("Q4)What is the name of the latest picture of Ranbir Kapoor and Katrina Kaif?");
        System.out.println("   (a)Wake Up Sid!                                (b)None of these");
        System.out.println("   (c)Saawaria                                    (d)Ajab Prem Ki Ghazab Kahani");
        String x4=input.readLine();
        if(x4.equals("d"))
        {
            total+=3;
            System.out.println("Your answer is correct. +"+3);
        }
        else
        {
            total-=1;
            System.out.println("Your answer is Wrong.  -"+1);
        }
        System.out.println("");
        System.out.println("Q5)Who has sung the song 'Prem Ki Naiyaa hai Ram ke Bharose'");
        System.out.println("   (a)Amrinder Gill                              (b)Shaan ");
        System.out.println("   (c)Nikhil(Bombay Wykey)                       (d)Udit Narayan ");
        String x5=input.readLine();
        if(x5.equals("c"))
        {
            total+=3;
            System.out.println("Your answer is correct. +"+3);
        }
        else
        {
            total-=1;
            System.out.println("Your answer is Wrong.  -"+1);
        }
        System.out.println("");
        System.out.println("Q6)Who is one of the actors in film '3-Idiots'");
        System.out.println("  (a)Aftab Shivdat Sani                                             (b)Sharman Joshi");
        System.out.println("  (c)Kabir Khan                                                     (d)Karan Shroff");
        String x6=input.readLine();
        if(x6.equals("b"))
        {
            total+=3;
            System.out.println("Your answer is correct. +"+3);
        }
        else
        {
            total-=1;
            System.out.println("Your answer is Wrong.  -"+1);
        }
        System.out.println("");
        System.out.println("Q7)Who's father is Chief Minister of Mumbai?");
        System.out.println("  (a)Ritesh Deshmukh                                         (b)Harman Baweja");
        System.out.println("  (c)Abhishekh Bachchan                                      (d)Arjun Rampal");
        String x7=input.readLine();
        if(x7.equals("a"))
        {
            total+=3;
            System.out.println("Your answer is correct. +"+3);
        }
        else
        {
            total-=1;
            System.out.println("Your answer is Wrong.  -"+1);
        }
        System.out.println("");
        System.out.println("Q8)Choose The odd one out:");
        System.out.println("  (a)Oxygen                                            (b)Helium");
        System.out.println("  (c)Nitrogen                                          (d)Carbon");
        String x8=input.readLine();
        if(x8.equals("d"))
        {
            total+=3;
            System.out.println("Your answer is correct. +"+3);
        }
        else
        {
            total-=1;
            System.out.println("Your answer is Wrong.  -"+1);
        }
        System.out.println("");
        System.out.println("Q9)Who is The Chief Minister of Punjab?");
        System.out.println("  (a)Prakash Singh Badal                                (b)Amrinder Singh");
        System.out.println("  (c)Rajinder Kaur Bhatal                               (d)Mahinder Singh K.P");
        String x9=input.readLine();
        if(x9.equals("a"))
        {
            total+=3;
            System.out.println("Your answer is correct. +"+3);
        }
        else
        {
            total-=1;
            System.out.println("Your answer is Wrong.  -"+1);
        }
        System.out.println("");
        System.out.println("Q10)What is the name of the latest Window released by microsoft?");
        System.out.println("   (a)Windows 7                                            (b)Windows Vista premium");
        System.out.println("   (c)Windows Ultimate 7                                   (d)Windows Glass");
        String x10=input.readLine();
        if(x10.equals("c"))
        {
            total+=3;
            System.out.println("Your answer is correct. +"+3);
        }
        else
        {
            total-=1;
            System.out.println("Your answer is Wrong.  -"+1);
        }
        System.out.println("");
        System.out.println("Q11)How many times can a person give IIT-JEE exam?");
        System.out.println("  (a)3                             (b)1");
        System.out.println("  (c)2                             (d)4");
        String x11=input.readLine();
        if(x11.equals("c"))
        {
            total+=4;
            System.out.println("Your answer is correct. +"+4);
        }
        else
        {
            total-=2;
            System.out.println("Your answer is Wrong.  -"+2);
        }
        System.out.println("");
        System.out.println("Q12)What was the name of the show hosted by Farah Khan");
        System.out.println("  (a)Tere mere beech mein                                (b)Terae merae beach main");
        System.out.println("  (c)Tere mere beach mein                                (d)Tere meare beach meain");
        String x12=input.readLine();
        if(x12.equals("c"))
        {
            total+=4;
            System.out.println("Your answer is correct. +"+4);
        }
        else
        {
            total-=2;
            System.out.println("Your answer is Wrong.  -"+2);
        }
        System.out.println("");
        System.out.println("Q13)Who is hosting the Big Boss-3?");
        System.out.println("  (a)Shilpa Shetty                         (b)Arshad Warsi");
        System.out.println("  (c)Amitabh Bachchan                      (d)Aftab Shivdat Sani");
        String x13=input.readLine();
        if(x13.equals("c"))
        {
            total+=4;
            System.out.println("Your answer is correct. +"+4);
        }
        else
        {
            total-=2;
            System.out.println("Your answer is Wrong.  -"+2);
        }
        System.out.println("");
        System.out.println("Q14)Who is the director of film 'BLACK'?");
        System.out.println("  (a)Sanjay Leelabh Ansali                  (b)Subhash Ghai");
        System.out.println("  (c)Karan Johar                            (d)Yash Chopra");
        String x14=input.readLine();
        if(x14.equals("a"))
        {
            total+=4;
            System.out.println("Your answer is correct. +"+4);
        }
        else
        {
            total-=2;
            System.out.println("Your answer is Wrong.  -"+2);
        }

        System.out.println("");
        System.out.println("Q15)Who is the brand ambassador of HPCL?");
        System.out.println("  (a)Mahendra Singh Dhoni                    (b)Priyanka Chopra");
        System.out.println("  (c)Sania Mirza                             (d)Hrithik Roshan");
        String x15=input.readLine();
        if(x15.equals("c"))
        {
            total+=4;
            System.out.println("Your answer is correct. +"+4);
        }
        else
        {
            total-=2;
            System.out.println("Your answer is Wrong.  -"+2);
        }
        System.out.println("");
        System.out.println("Q16)Who was the winner of second T-20 World Cup?");
        System.out.println("  (a)India                           (b)Pakistan");
        System.out.println("  (c)Australia                       (d)New Zealand");
        String x16=input.readLine();
        if(x16.equals("b"))
        {
            total+=4;
            System.out.println("Your answer is correct. +"+4);
        }
        else
        {
            total-=2;
            System.out.println("Your answer is Wrong.  -"+2);
        }
        System.out.println("");
        System.out.println("Q17)Who was the captain of Indian Cricket team when it won World Cup in 1983? ");
        System.out.println("  (a)Sourav Ganguly                 (b)Kapil Dev");
        System.out.println("  (c)Mahendra Singh Dhoni           (d)Sunil Gavaskar");
        String x17=input.readLine();
        if(x17.equals("b"))
        {
            total+=4;
            System.out.println("Your answer is correct. +"+4);
        }
        else
        {
            total-=2;
            System.out.println("Your answer is Wrong.  -"+2);
        }
        System.out.println("");
        System.out.println("Q18)Choose the odd one out?");
        System.out.println("  (a)Tissue                     (b)Paper");
        System.out.println("  (c)Napkin                     (d)Page");
        String x18=input.readLine();
        if(x18.equals("a"))
        {
            total+=4;
            System.out.println("Your answer is correct. +"+4);
        }
        else
        {
            total-=2;
            System.out.println("Your answer is Wrong.  -"+2);
        }
        System.out.println("");
        System.out.println("Q19)Who has played the role of Jasmine in the recent film 'ALADIN'?");
        System.out.println("  (a)Anushka Sharma                   (b)Rina Shah");
        System.out.println("  (c)Priya Mehra                      (d)Jaquiline");
        String x19=input.readLine();
        if(x19.equals("d"))
        {
            total+=4;
            System.out.println("Your answer is correct. +"+4);
        }
        else
        {
            total-=2;
            System.out.println("Your answer is Wrong.  -"+2);
        }
        System.out.println("");
        System.out.println("Q20)What is the name of film which got 8 oscars?");
        System.out.println("  (a)The Da Vince Code               (b)Titanic");
        System.out.println("  (c)Slumdog Millionaire             (d)The Lives of Others");
        String x20=input.readLine();
        if(x20.equals("b"))
        {
            total+=4;
            System.out.println("Your answer is correct. +"+4);
        }
        else
        {
            total-=2;
            System.out.println("Your answer is Wrong.  -"+2);
        }
        System.out.println("");
        System.out.println("Q21)If a coin is tossed, then what is the probability of appearing no heads?");
        System.out.println("  (a)0/2                        (b)2/2");
        System.out.println("  (c)1/2                        (d)2/3");
        String x21=input.readLine();
        if(x21.equals("c"))
        {
            total+=6;
            System.out.println("Your answer is correct. +"+6);
        }
        else
        {
            total-=3;
            System.out.println("Your answer is Wrong.  -"+3);
        }
        System.out.println("");
        System.out.println("Q22)Which is the wrong Quantum combination?");
        System.out.println("  (a)n=3, l=2, m=-1                   (b)n=5, l=5, m=0");
        System.out.println("  (c)n=4, l=1, m=3                    (d)n=2, l=1, m=1");
        String x22=input.readLine();
        if(x22.equals("b"))
        {
            total+=6;
            System.out.println("Your answer is correct. +"+6);
        }
        else
        {
            total-=3;
            System.out.println("Your answer is Wrong.  -"+3);
        }
        System.out.println("");
        System.out.println("Q23)How many more words can be made from word 'Equation'");
        System.out.println("  (a)40230              (b)720");
        System.out.println("  (c)5020               (d)120");
        String x23=input.readLine();
        if(x23.equals("a"))
        {
            total+=6;
            System.out.println("Your answer is correct. +"+6);
        }
        else
        {
            total-=3;
            System.out.println("Your answer is Wrong.  -"+3);
        }
        System.out.println("");
        System.out.println("Q24)Which of the following magnitudes can not result in 2m");
        System.out.println("  (a)1m and 1m                     (b)1m and 3m");
        System.out.println("  (c)1m and 2m                     (d)1m and 4m");
        String x24=input.readLine();
        if(x24.equals("d"))
        {
            total+=6;
            System.out.println("Your answer is correct. +"+6);
        }
        else
        {
            total-=3;
            System.out.println("Your answer is Wrong.  -"+3);
        }
        System.out.println("");
        System.out.println("Q25)If every second day water in a flask gets doubled,");
        System.out.println("    and it gets full in 30 days. Then how many days did it take to fill upto 1/4th of it? ");
        System.out.println("  (a)25th day                                 (b)28th day");
        System.out.println("  (c)15th day                                 (d)7and a 1/2 day");
        String x25=input.readLine();
        if(x25.equals("b"))
        {
            total+=6;
            System.out.println("Your answer is correct. +"+6);
        }
        else
        {
            total-=3;
            System.out.println("Your answer is Wrong.  -"+3);
        }
        System.out.println("The total out of 100 is:--> "+total);
        System.out.println("Your percentage is:-->    "+total+"%");
        
        System.out.println("      ..............Thank You..........");
        
    }
}