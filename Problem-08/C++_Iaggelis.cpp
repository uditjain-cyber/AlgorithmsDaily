/*
Author : John Angelis
College : Aristotle University of Thessaloniki
Year/Department : II/Physics
E-Mail Id : john_agelis@hotmail.com
*/

// Approximating square roots using Newton's method
#include <iostream>

using namespace std;

double sqrt_approx(const double z)
{
   // We gonna deal with real numbers' roots only
   if (z < 0)
   {
      cout << "Imaginary root!!\n";
      return -1;
   }
   if (z == 0)
   {
      return 0; // sqrt(0)=0
   }

   /* Suppose we have the function x=sqrt(a), with a>0. That means
   we need to solve the equation x^2 - a=0. Using Newton's method
   (https://en.wikipedia.org/wiki/Newton%27s_method)with f(x)=x^2 - a, 
   we get the sequence:
      x_{n+1} = x_n - (x_n^2-a)/(2*x_n)
   Using the z as a and the start value of x_n we get a good approximation
   of the square root. The precision which the method approximates the real 
   number depends of the iterations. Here we using 25 iterations.
   */
   double guess = z;
   for (int i = 0; i < 25; i++)
      guess -= (guess * guess - z) / (2 * guess);
   return guess;
}
int main()
{
   double x; // the number its root we looking
   int pr; // output precision
   cout << "Input: ";
   cout << ": ";
   cin >> x;
   cout << "Precision: ";
   cin >> pr;
   cout.precision(pr + 1);
   cout << "Output: " << sqrt_approx(x) << '\n';

   return 0;
}
