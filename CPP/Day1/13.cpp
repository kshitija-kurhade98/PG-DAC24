/*13:Check whether the number is palindrome or not?*/
#include<iostream>
using namespace std;

int main(){
    int number, rev_number=0;
    cout<<"Enter Number : "<<endl;
    cin>>number;
    int org_number = number;
    while (number >0)
    {
        int rem = number % 10;
        rev_number = rev_number * 10 + rem;
        number /= 10;
    }

    if(org_number == rev_number){
        cout<<org_number<<" is Palindrome";
    }
    else{
        cout<<org_number<<" is Not Palindrome";
    }
    return 0;
}