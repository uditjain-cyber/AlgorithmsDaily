/*
Name : Abhilasha Sinha
College : Birla Institute of Technology Mesra
Year/Branch : 2nd year CSE
Email Id : abhisinha662000@gmail.com
*/
#include <bits/stdc++.h>
using namespace std;
 bool prime[100005];
void sieve()
{
    memset(prime, true, sizeof(prime));
    for (int p=2; p*p<100005; p++)
    {
        if (prime[p] == true)
        {
            for (int i=p*p; i<100005; i += p)
                prime[i] = false;
        }
    }

}

int main()
{
    sieve();
    int n;
    cin>>n;
    for (int p=2; p<=n; p++)
       if (prime[p])
          cout << p << " ";

    return 0;
}
