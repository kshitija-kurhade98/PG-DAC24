/*11:Check if number is a prime number or not.:*/
#include<iostream>
using namespace std;

int main(){
    int num, flag=0;

    cout<<"Enter Number : "<<endl;
    cin>>num;

    for(int i = 2; i <= num/2; i++)
    {
       if(num%i == 0){
            flag = 1;
        }
    }

    if(flag==0){
        cout<<num<<" is Prime"<<endl;
    }else{
        cout<<num<<" is NotPrime"<<endl;
    }
    
    
}