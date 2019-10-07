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
    String s = ob.next();
    System.out.println("Input : Expression = "+s);
    String ans = balancedParentheses(s);
    System.out.println("Output : "+ans);
  }
	
  static boolean isMatchingPair(char character1, char character2) 
  {
     if ((character1 == '(' && character2 == ')') || (character1 == '{' && character2 == '}') || (character1 == '[' && character2 == ']')) 
       return true;
     else
       return false;
  }
	
  static String balancedParentheses(String s)
  {
    Stack<Character> stack = new Stack<Character>();
    char[] exp = s.toCharArray();
    String ans = "Not Balanced";
    for(int i=0;i<s.length();i++)
    {

      if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
          stack.push(exp[i]);

      if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']')
      {
        if (stack.empty())
        {
          ans = "Not Balanced";
          return ans;
        }
        else if (!isMatchingPair(stack.pop(), exp[i]))
        {
          ans = "Not Balanced";
          return ans;
        }
      }
      
    }
    if (stack.empty())
        ans = "Balanced";

    return ans;
  }
}
