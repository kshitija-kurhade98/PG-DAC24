/*2. Write a program to accept two integers x and n and compute x raised to n.*/
#include<iostream>
using namespace std;

int main(){
    int x,n,res=1, i=1;
    cout<<"Enter X and N : "<<endl;
    cin>>x>>n;
    while(i<=n){
        res *= x;
        i++;    
    }
    cout<<x<<" ^ "<<n<<" = "<<res;
    return 0;
}