
/*3. Write a program to accept a character, an integer n and display the next n characters.*/

#include<iostream>
using namespace std;

int main(){

    char ch;
    int n,i=0;

    cout<<"Enter Character : "<<endl;
    cin>>ch;

    cout<<"Enter N (n next characters) : "<<endl;
    cin>>n;

    // for(int i = 0; i!=n; i++){
    //     cout<<ch<" ";
    //     ch++;
    // }

    while(i!=n){
        cout<<ch<<" ";
        ch++; i++;
    }

    return 0;
}