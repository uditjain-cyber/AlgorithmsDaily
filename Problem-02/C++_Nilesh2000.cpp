//A program to check if a string contains balanced parantheses.
# include <iostream>
# include <stack>

using namespace std;

bool ArePair(char Opening, char Closing)
{
    if(Opening == '(' && Closing == ')')
      return true;
    if(Opening == '{' && Closing == '}')
      return true;
    if(Opening == '[' && Closing == ']')
      return true;
    return false;
}

/*
The idea here is to use a stack so that we can push into the stack if one of the characters if (,{ or [. And if it is one of ),},], we then check if the
stack is empty or not.
If the stack is empty, we return false to main().
If it is not empty, we then check if the topmost element of the stack forms a pair with one of the types of the closing brackets.
If they do form a pair, we pop out the topmost element of the stack and continue to iterate through the string.
If we exit the loop successfully, we then check if the stack is finally empty or not.
If it is not empty, we return false, else just return true back to main().
*/
bool checkBalancedParantheses(string str)
{
    stack <char> S;
    int Len = str.length();
    for(int i = 0 ; i < Len ; i++)
    {
        if(str[i] == '(' || str[i] == '{' || str[i] == '[')
        {
            S.push(str[i]);
        }
        else
        {
            if(S.empty() || !ArePair(S.top(), str[i]))
              return false;
            else
              S.pop();
        }
    }
    return S.empty() ? true : false;
}

//Driver function
int main(void)
{
    string s;
    cin >> s;
    if(checkBalancedParantheses(s))
      cout << "\nThe string consists of balanced parantheses.";
    else
      cout << "\nThe string does not consist of balanced parantheses.";
    return 0;
}
