/* Create a class Person with data members as name, age, city. Write getters and setters for all the data 
members. Also add the display function. Create Default and Parameterized constructors. Create the 
object of this class in main method and invoke all the methods in that class.*/

#include<iostream>
#include<string.h>
using namespace std;

class Person{
    char name[10], city[10];
    int age;

    public :

    Person(){
        char new_name[10] = "kk";
        strcpy(name,new_name);
    }


    void accept(){
        cout<<"Enter Name : "<<endl;
        gets(name);
        cout<<"Name : "<<name;

        cout<<"Enter City : "<<endl;
        gets(city);
        cout<<"City : "<<city;


        //for(int i=0; i<10; i++){
        //    cin>> arr[i];
        //}

        //strcpy(name,arr);

        
    }

    void setName(){
        char new_name[10];
        cout<<"Enter Name : "<<endl;
        gets(new_name);
        strcpy(this->name,new_name);
    }

    void setCity(){
        char city[10];
        cout<<"Enter City : "<<endl;
        gets(city);
        strcpy(this->city,city);
    }

    void getName(){
        cout<<"Name : "<<name<<endl;
    }

    void getCity(){
        cout<<"City : "<<city;
    }


};

int main(){

    Person obj;
    //obj.accept();

    obj.setName();
    obj.setCity();

    return 0;

}