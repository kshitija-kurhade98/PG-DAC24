/*15: Write a  program to enter a number and print its reverse.*/
#include<iostream>
using namespace std;
 int main(){
    int number,rev_num=0;

    cout<<"enter number : "<<endl;
    cin>>number;

    //int org_num = number;

    while(number >0){
        int rem = number % 10;
        rev_num = rev_num * 10 + rem;
        number /=10;
    }

    cout<<"Reversed Number : "<<rev_num;
 }