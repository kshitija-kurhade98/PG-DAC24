/*9:Write a program to find factorial of a given number. ex:no5  fact=5*4*3*2*1=120*/
#include<iostream>
using namespace std;

int main(){
    int n, fact=1;
    cout<<"Enter Number : "<<endl;
    cin>>n;
    for(int i = 1; i<=n ; i++){
        fact = fact*i;
    }
    cout<<"Factorial : "<<fact;
    return 0;
}