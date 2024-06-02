/*17:Write a program to check entered number is Armstrong number or not.*/
#include<iostream>
using namespace std;

int main(){
    int num, rem, sum=0, temp;

    cout<<"Enter Number : "<<endl;
    cin>>num;

    for(temp = num; num!=0; num = num/10){
        rem = num % 10;
        sum = sum +(rem*rem*rem);
    }

    if(sum==temp){
        cout<<temp<<" is Armstromg No.";
    }else{
        cout<<temp<<" is Not Armstromg No.";
    }

    return 0;
}