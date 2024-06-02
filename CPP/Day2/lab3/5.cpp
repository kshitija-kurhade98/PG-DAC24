/*5:Write a program to accept array  from user .Accept number from user and search number is present in array or not.*/

#include<iostream>
using namespace std;

int main(){
    int arr[5], key;
    cout<<"Enter Array Elemnts : "<<endl;

    for(int i =0 ; i<5; i++){
        cin>>arr[i];
    }

    cout<<"Enter element to search : "<<endl;
    cin>>key;

    for(int i =0; i<5; i++){
        if(key ==  arr[i])
            cout<<"Element found at Location : "<<i+1<<endl;
    }
    return 0;
}