package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Recursion {
    static int theNumber;
    public static void main(String[] args) throws IOException
    {
        System.out.print("Enter a number: ");
        theNumber = getInt();
        int theAnswer = triangle(theNumber);
        System.out.println("Triangle="+theAnswer);
    }
    //-------------------------------------------------------------
    public static int triangle(int n)
    {
        System.out.println(n);
        if(n==1)
            return 1;
        else
            return( n + triangle(n-1) );
    }
    //-------------------------------------------------------------
    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    public static int getInt() throws IOException
    {
        String s = getString();
        return Integer.parseInt(s);
    }
}
