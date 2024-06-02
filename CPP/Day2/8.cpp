/*8. Write a program to print all prime numbers between 1 to n*/

#include<iostream>
using namespace std;

int main(){
    int n;

    cout<<"Enter Value of N ;"<<endl;
    cin>>n;

    for(int i =2; i<=n; i++){
        int flag =0;
        for(int j=2; j<=i/2; ++j){
            if(i%j ==0){
                flag = 1;
                break;
            }
        }
        if(flag==0){
            cout<<i<<" ";
        }
    }
    return 0;
}