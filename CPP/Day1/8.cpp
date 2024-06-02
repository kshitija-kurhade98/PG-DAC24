/* Write a  program to input angles of a triangle and check whether triangle is valid or not.*/
#include<iostream>
using namespace std;

int main(){
    int angle1,angle2,angle3,res;
    cout<<"Enter angle1,angle2,angle3 "<<endl;
    cin>>angle1>>angle2>>angle3;

    res = angle1+angle2+angle3;

    if(res==180){
        cout<<"Traingle is valid";
    }
    else{
        cout<<"Traingle is not valid";
    }

    return 0;
}
    