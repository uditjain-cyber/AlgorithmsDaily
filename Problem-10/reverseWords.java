/*
Author : Ayush Agrawal
College : BITS Pilani - KK Birla Goa Campus
Year/Department : 3rd year - Electronics and Instrumentation
E-Mail Id : f20170604@goa.bits-pilani.ac.in
*/

import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        StringTokenizer str = new StringTokenizer(s);
        int n = str.countTokens();
        String words[] = new String[n];
        for (int i = 0; i < n; i++)
            words[i]= str.nextToken();
        for (int i = n-1; i >= 0; i--)
            if(i!=0)
                System.out.print(words[i]+" ");
            else
                System.out.print(words[i]);
    }
}
