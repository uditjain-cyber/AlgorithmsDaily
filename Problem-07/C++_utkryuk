/*
Author : Utkarsh Gupta
College : BIT MESRA
Year/Department : III/IT
E-Mail Id : utkryuk@gmail.com
*/
//A program that converts roman numeral string into its decimal equivalent.
#include <bits/stdc++.h>
using namespace std;
int romanToInt(string s){
    int ans = 0;
    for(int i=0;i<s.length();i++){
        if(i==s.length()-1){
            if(s[i]=='I')
                ans = ans + 1;
            else if(s[i]=='V')
                ans = ans + 5;
            else if(s[i]=='X')
                ans = ans + 10;
            else if(s[i]=='L')
                ans = ans + 50;
            else if(s[i]=='C')
                ans = ans + 100;
            else if(s[i]=='D')
                ans = ans + 500;
            else if(s[i]=='M')
                ans = ans + 1000;
        }
        else{
            if(s[i]=='I' && s[i+1]=='V'){
                ans = ans + 4;
                i = i + 1;
            }
            else if(s[i]=='I' && s[i+1]=='X'){
                ans = ans + 9;
                i = i + 1;
            }
            else if(s[i]=='I')
                ans = ans + 1;
            else if(s[i]=='V')
                ans = ans + 5;
            else if(s[i]=='X' && s[i+1]=='L'){
                ans = ans + 40;
                i = i + 1;
            }
            else if(s[i]=='X' && s[i+1]=='C'){
                ans = ans + 90;
                i = i + 1;
            }
            else if(s[i]=='X')
                ans = ans + 10;
            else if(s[i]=='L')
                ans = ans + 50;
            else if(s[i]=='C' && s[i+1]=='D'){
                ans = ans + 400;
                i = i + 1;
            }
            else if(s[i]=='C'&& s[i+1]=='M'){
                ans = ans + 900;
                i = i + 1;
            }
            else if(s[i]=='C')
                ans = ans + 100;
            else if(s[i]=='D')
                ans = ans + 500;
            else if(s[i]=='M')
                ans = ans + 1000;
        }
    }
    return ans;
}
int main(){
	string input;
	cin>>input;
	int output = romanToInt(input);
	cout<<"The decimal equivalent is = "<<output<<"\n";
	return 0;
}
