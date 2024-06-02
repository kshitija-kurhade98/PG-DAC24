/*5. Write a program to accept a number and check if it is divisible by 5 and 7.*/
#include<iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter Number : "<<endl;
    cin>>num;
    if(num%5==0 && num%7==0){
        cout<<num<<" divisble by both 5 and 7";
    }else{
        cout<<num<<" not divisible by both5 and 7";
    }
    return 0;
}