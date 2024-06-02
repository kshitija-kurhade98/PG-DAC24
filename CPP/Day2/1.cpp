/*1:Write a program that accepts numbers continuously as long as the number is positive and prints the 
sum of the given numbers. */
#include<iostream>
using namespace std;

int main(){
    int no,sum=0;
    cout<<"Enter Number : "<<endl;
    while(no>0){
              cin>>no;
              if(no>0)
                sum = sum+no;
    }
    
    cout<<"Exiting....... as you entered -ve no. \n\nSum of Numbers = "<<sum;
    return 0;
}