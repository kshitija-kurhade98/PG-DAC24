/*Write a program to swap two numbers.*/

#include<iostream>
using namespace std;

class Swap{
    public : int num1,num2;
    void acceptNum(){
        cout<<"Enter Num1 and Num2 :"<<endl;
        cin>>num1>>num2;
    }

    void swapNum(){
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        cout<<"After Swap : "<<endl;
        cout<<"num1 : "<<num1<<" num2 : "<<num2;
    }
};

int main(){

    Swap obj;
    obj.acceptNum();
    obj.swapNum();
    return 0;
}