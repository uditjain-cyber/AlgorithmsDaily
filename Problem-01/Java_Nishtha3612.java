
/*
Author : <Nishtha>
College : <Guru Nanak Dev Engineering College Ludhiana,Punjab,India>
Year/Department : <3rd Year>/<Computer Science and Enginerring>
E-Mail Id : <nishthaarora002@gmail.com>
import java.util.Scanner;

 class Sieve
{
	int i;
	int p;
     void Eratosthenes(int n)
    {
		 boolean Array[]=new boolean[n+1];    //consider a boolean array
        for( i=0;i<=n;i++)
		{
        Array[i]=true;            //initialise all numbers are true
		//System.out.print(i);
		}
        for(  p=2;p*p<=n;p++)
        {
            if(Array[p]==true)
            {
                for(i=p*p;i<=n;i+=p)
                {
                    Array[i]=false;              //false for multiples of p
					System.out.println(i);

                }
            }
        }

        for(i=2;i<=n;i++)           
        {
            if(Array[i]==true)
            System.out.println("Prime numbers are" + i) ;             //printn all prime numbers
        }
		 


    }
    public static void main(String args[])

    {
		int n;
		
		Scanner sc=new Scanner(System.in);
			System.out.println("enter  number n to check prime number smaller than or equal to thet number");
			 n=sc.nextInt();
			Sieve s=new Sieve();
			s.Eratosthenes(n);
		
        
    }
}