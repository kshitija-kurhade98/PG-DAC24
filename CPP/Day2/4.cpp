/*4. Write a program to calculate factorial of a number*/
#include<iostream>
using namespace std;

int main(){
    int n, fact=1;
    cout<<"Enter Number : "<<endl;
    cin>>n;
    for(int i=1; i<=n; i++){
        fact = fact * i ;
    }
    cout<<"Fcatorial : "<<fact;
    return 0;
}