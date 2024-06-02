/*Write a program, which accepts two integers and an operator as a character (+ - * / ), performs the 
corresponding operation and displays the result.*/

#include<iostream>
using namespace std;

int main(){
    int num1, num2, res;
    char ch;

    cout<<"Enter NUM1 NUM2 : "<<endl;
    cin>>num1>>num2;
    cout<<"Enter Operator (+ - * /) : "<<endl;
    cin>>ch;

    switch(ch){
        case '+' : res = num1 + num2; cout<<num1<<" + "<<num2<<" = "<<res<<endl; break;
        case '-' : res = num1 - num2; cout<<num1<<" - "<<num2<<" = "<<res<<endl; break;
        case '*' : res = num1 * num2; cout<<num1<<" * "<<num2<<" = "<<res<<endl; break;
        case '/' : res = num1 / num2; cout<<num1<<" / "<<num2<<" = "<<res<<endl; break;
        default : cout<<"Invalid Operator!"<<endl;break;
    }

    return 0;
}