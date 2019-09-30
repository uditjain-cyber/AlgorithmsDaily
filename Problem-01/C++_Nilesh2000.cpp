// A program to implement the Sieve Of Eratosthenes algorithm.
//Time Complexity : O(n log n log n)
# include <iostream>
# include <string.h>

using namespace std;

void sieveOfEratosthenes(int n)
{
    bool Prime[n + 1]; //Define a boolean variable Prime of size n+1. Size is n+1 because it consists of elements from 0 to n.
    memset(Prime, true, sizeof(Prime)); //Iniialize all entries to true in the boolean array.
    for(int i = 2 ; i * i <= n ; i++)
    {
        if(Prime[i] == true) //If the number is prime, set all it's multiples to not prime.
        {
          //Update all multiples of p greater than or  equal to the square of it numbers which are multiple of p and are less than p^2 are already
          //been marked.
            for(int j = i * i ; j <= n ; j+=i)
            {
                Prime[j] = false;
            }
        }
    }
    //Print all the prime numbers
    for(int i = 2 ; i <= n ; i++)
    {
        if(Prime[i])
        {
            cout << i << " ";
        }
    }
}

int main(void) //Driver function
{
    int n;
    cout << "Enter n : ";
    cin >> n;
    sieveOfEratosthenes(n);
    cout << "\n";
    return 0;
}
