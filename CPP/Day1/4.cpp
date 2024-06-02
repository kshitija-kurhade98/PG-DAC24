/*Write a program to accept an integer and check if it is even or odd.*/
#include<iostream>
using namespace std;

int main(){
    int num;
    cout<<"Enter Number : "<<endl;
    cin>>num;

    if(num%2==0){
        cout<<num<<" is even"<<endl;
    }else{
        cout<<num<<" is odd"<<endl;
    }
    return 0;
}