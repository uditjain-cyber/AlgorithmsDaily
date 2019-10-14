/*
Author : <Shashank>
College : <Birla Institute of Technology,Mesra>
Year/Department : <2nd>/<Computer Science and Engineering>
E-Mail Id : <jhashashank944@gmail.com>
*/

#include<iostream>
using namespace std;

int main() {
    int n;
    cin>>n;
    int arr[n-1];
    int sum = 0;
    for(int i = 0;i < n-1;i++) {
        cin>>arr[i];
        sum += arr[i];
    }
    int tot_sum = n*(n+1)/2;
    int num = tot_sum - sum;
    cout<<num;
    return 0;
}
