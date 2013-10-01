//To print alphabets with example by input through user.
import java.io.*;
public class abc
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("Enter any alphabet");
        char ch=(char)input.read();
        switch(ch)
        {
            case 'a':
            System.out.println("a for apple");
            break;
            case 'b':
            System.out.println("b for ball");
            break;
            case 'c':
            System.out.println("c for cat");
            break;
            case 'd':
            System.out.println("d for dog");
            break;
            case 'e':
            System.out.println("e for elephant");
            break;
            case 'f':
            System.out.println("f for fish");
            break;
            case 'g':
            System.out.println("g for goat");
            break;
            case 'h':
            System.out.println("h for hut");
            break;
            case 'i':
            System.out.println("i for ice cream");
            break;
            case 'j':
            System.out.println("j for joker");
            break;
            case 'k':
            System.out.println("k for kite");
            break;
            case 'l':
            System.out.println("l for lion");
            break;
            case 'm':
            System.out.println("m for man");
            break;
            case 'n':
            System.out.println("n for nest");
            break;
            case 'o':
            System.out.println("o for owl");
            break;
            case 'p':
            System.out.println("a for peacock");
            break;
            case 'q':
            System.out.println("q for queen");
            break;
            case 'r':
            System.out.println("r for rat");
            break;
            case 's':
            System.out.println("s for ship");
            break;
            case 't':
            System.out.println("t for tiger");
            break;
            case 'u':
            System.out.println("u for umbrella");
            break;
            case 'v':
            System.out.println("v for van");
            break;
            case 'w':
            System.out.println("w for watch");
            break;
            case 'x':
            System.out.println("x for x-mas tree");
            break;
            case 'y':
            System.out.println("y for yatch");
            break;
            case 'z':
            System.out.println("z for zebra");
            break;
            default:
            System.out.println("Wrong choice");
            break;
        }
    }
}