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
        int n = ob.nextInt();
        int a[] = new int[n];
        int ans = 1;
        for(int i=1;i<=n;i++) {
            a[i-1] = ob.nextInt();
            ans += i+1;
            ans -= a[i-1];
        }
        System.out.println(ans);
    }
}
