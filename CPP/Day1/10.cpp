/*10:Write a program to find m to the power n. m=3 and n=4 so 3*3*3*3*/
#include<iostream>
using namespace std;
int main(){
    int m, n, result=1;
    cout<<"________Find m to the power n __________"<<endl;
    cout<<"Enter m and n :"<<endl;
    cin>>m>>n;
    int i=1;
    for (int i = 0; i < n; ++i) {
        result *= m;
    }

    cout<<"result : "<<result;
    return 0;
}

