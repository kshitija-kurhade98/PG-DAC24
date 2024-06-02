/*14:Write a  program to find sum of all even and odd numbers between 1 to n. */

#include<iostream>
using namespace std;

int main(){
    int n,evenSum=0, oddSum=0;

    cout<<"Enter N : "<<endl;
    cin>>n;

    for (int i = 1; i <= n; i++)
    {
        if(i%2==0){
            evenSum += i;
        }else{
            oddSum += i;
        }
    }

    cout<<"evenSum = "<<evenSum<<endl;
    cout<<"oddSum = "<<oddSum;
    
    return 0;
}