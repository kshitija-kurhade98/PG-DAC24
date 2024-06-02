/*3:. Write a  program to find sum of all even and odd numbers between 1 to n.*/

#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter N :"<<endl;
    cin>>n;

    int even_sum, odd_sum;
    even_sum = odd_sum = 0;

    for(int i = 1 ; i<=n; i++){
        if(i%2 == 0){
            even_sum += i;
        }
        else{
            odd_sum += i;
        }
    }

    cout<<"Even Sum : "<<even_sum<<endl;
    cout<<"Odd Sum : "<<odd_sum<<endl;
    return 0;
}