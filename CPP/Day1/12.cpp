/*12:Sum of series :
	1+2+3+….+n*/

#include<iostream>
using namespace std;
int main(){
    int n,sum=0;

    cout<<"Enter no. of elements of series"<<endl;
    cin>>n;

    for (int i = 1; i <= n; i++)
    {
        sum+=i;
        cout<<i;
        if(i<n)
            cout<<" + ";
    }
    cout<<" = "<<sum<<endl;

    return 0 ;
}