/*
Author : Utkarsh Gupta
College : Birla Institute of Technology, Mesra
Year/Department : III/IT
E-Mail Id : utkryuk@gmail.com
*/

#include<bits/stdc++.h>
#define ll long long int
using namespace std;
ll inversionCount;
ll merge(ll a[],ll start, ll mid,ll end){
    ll p = start, q = mid + 1;
    ll temp[end-start+1], k = 0;
    ll inversionCount = 0;
    for(ll i = start; i<=end;i++){
        if(p>mid)
            temp[k++] = a[q++];
        else if(q>end)
            temp[k++] = a[p++];
        else if(a[p]<=a[q])
            temp[k++] = a[p++];
        else{
            inversionCount += (mid - p + 1);   //inversionCount updation Step
            temp[k++] = a[q++];
        }
    }
    for(ll i = 0;i<k;i++){
        a[start++] = temp[i];
    }
    return inversionCount;
}
ll mergeSort(ll input[],ll start, ll end){
    if(start<end){
        ll mid = start + (end - start)/2;
        inversionCount = mergeSort(input,start, mid);
        inversionCount = mergeSort(input,mid+1,end);
        inversionCount += merge(input,start,mid,end);
    }
    return inversionCount;
}
int main(){
    ll inputArraySize;
    cin>>inputArraySize;
    ll input[inputArraySize];
    for(ll i=0;i<inputArraySize;i++)
    	cin>>input[i];
    cout<<mergeSort(input,0,inputArraySize-1);  // prints inversionCount 
    return 0;
}
