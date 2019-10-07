/*
Author : Ayush Agrawal
College : BITS Pilani - KK Birla Goa Campus
Year/Department : 3rd year - Electronics and Instrumentation
E-Mail Id : f20170604@goa.bits-pilani.ac.in
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		System.out.println("Input : n = "+n);
		ArrayList<Integer> ans = sieveOfEratosthenes(n);
		System.out.print("Output : ");
		for(int i=0;i<ans.size();i++)
		    if(i!=ans.size()-1)
		        System.out.print(ans.get(i)+" ");
		    else
		        System.out.print(ans.get(i));
		System.out.println();
	}
	
	static ArrayList<Integer> sieveOfEratosthenes(int n)
	{
	    ArrayList<Integer> num = new ArrayList<Integer>();
		boolean prime[] = new boolean[n+1];
		for(int i=0;i<n;i++)
			prime[i] = true;
		
		for(int p = 2; (int)Math.pow(n,2) <= n; p++)
		{
			if(prime[p] == true)
			{
				for(int i = p*2; i <= n; i += p)
					prime[i] = false;
			}
		}
		
		for(int i = 2; i <= n; i++)
		{
			if(prime[i] == true)
				num.add(i);
		}
		return num;
	}
}
