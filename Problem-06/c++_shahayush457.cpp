/*
Author : <Ayush Shah>
College : <BIT Mesra>
Year/Department : <2nd>/<Mathematics and computingt>
E-Mail Id : <shahayush457@gmail.com
*/

#include<bits/stdc++.h>
using namespace std;

int main(){
	int n;
	cin >> n;
	int a[n-1];
	for(int i = 0; i<n-1; i++)
	cin >> a[i];
	
	int num = -1;
	for(int i = 0; i<n-2; i++){
		if(abs(a[i] - a[i+1]) > 1){
			num = a[i] + 1;
			break;
		}
	}
	if(num == -1){
		if(a[0] != 1)
		num = 1;
		else
		num = n;
	}
	
	cout << num;
	
	return 0;
}
