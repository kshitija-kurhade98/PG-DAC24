/*18:Write a program to find greatest of three numbers using nested if-else.*/
#include<iostream>
using namespace std;

int main(){
    int a, b, c;
    cout<<"Enter a b c : "<<endl;
    cin>>a>>b>>c;

    if(a>b){
        if(a>c){
            cout<<a<<" A is greater"<<endl;
        }
        else{
            cout<<c<<" C is greater"<<endl;
        }
    }else{
        cout<<b<<" B is greater"<<endl;
    }
}