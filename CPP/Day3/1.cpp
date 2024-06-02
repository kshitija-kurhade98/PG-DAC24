/*1:Write a program to create student class with data members rollno, marks1,mark2,mark3.
Accept data (acceptInfo()) and display  using display member function.
Also display total,percentage and grade.
*/

#include<iostream>
using namespace std;

class student{
    int rollno, mark1, mark2, mark3, total; 
    double percent;

    public :
    void acceptInfo(){
        cout<<"Enter Roll No. :"<<endl;
        cin>>rollno;
        cout<<"Enter Marks1 Marks2 Marks3 : "<<endl;
        cin>>mark1>>mark2>>mark3;
    }

    void display(){
        cout<<"\n--------- Student Info -----------\n";
        cout<<"RollNo : "<<rollno<<"\nMark1 : "<<mark1<<"\nMark2 : "<<mark2<<"\nMark3 : "<<mark3<<endl;
    }

    int calTotal(){
        total = mark1+mark2+mark3;
        return total;
    }

    void display_percent(){
        percent = 100 * total/300;
        cout<<"\nPercent : "<<percent<<endl;
    }

    void show_grade(){

        if(percent>85)
            cout<<"Grade A"<<endl;
        else if(percent>65 && percent<85)
            cout<<"Grade B"<<endl;
        else if(percent>45 && percent<65)
            cout<<"Grade C"<<endl;
        else if(percent>35 && percent<45)
            cout<<"Grade D"<<endl;
        else
            cout<<"Fail"<<endl;
    }
  
};

int main(){

    student sobj;
    sobj.acceptInfo();
    sobj.display();

    int total = sobj.calTotal();
    cout<<"\nTotal Obtained Marks : "<<total;

    sobj.display_percent();
    sobj.show_grade();

    return 0;

}