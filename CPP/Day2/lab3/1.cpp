/*1:Write a program to create an array of integers and perform following operations on that array like 
finding the sum, average, maximum and minimum number in that array. Accept the numbers of the 
array from user.*/

#include<iostream>
using namespace std;

int main(){

    int size, sum = 0;
    cout<<"Enter Size of array\n";
    cin>>size;
    int arr[size];
    cout<<"Enter array elements : "<<endl;

    for(int i = 0; i < size; i++){
        cout<<"Enter element at location : "<<i+1<<endl;
        cin>>arr[i];
        sum += arr[i];
    }

    double avg = sum/size;

    cout<<"\nSum : "<<sum;
    cout<<"\nAverage: "<<avg;

    int min , max;

    min = arr[0];
    for(int i = 0; i < size; i++){
        if(arr[i] < min){
            min  = arr[i];
        }
    }
    max = arr[0];
    for(int i = 0; i < size; i++){
        if(arr[i] > max){
            max  = arr[i];
        }
    }

    cout <<"\nMaximum : "<<max;
    cout<<"\nMinimum : "<<min;

    return 0;
}