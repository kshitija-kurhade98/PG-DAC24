/*19:Create menu driven program for Pizza Shop.And display total amount*/
#include<iostream>
using namespace std;

class pizza{
    int amount;
    public : 
        pizza(){
            amount = 0;
        }

    void addMiniPizza(){
        amount += 250;
    }
    
    void addGarlicBread(){
        amount += 120;
    }

    void addChocoLavaCake(){
        amount += 90;
    }

    void addPepsi(){
        amount += 30;
    }

    void displayBill(){
        cout<<"Total Amount : "<<amount<<endl;
    }

};

int main(){
    pizza obj;
    int ch;
    do{
        cout<<"___________MENU____________"<<endl;
        cout<<"1.Mini Pizza \n2.Garlic Bread \n3.Choco LavaCake \n4.Pepsi \n5.Total Bill \n6.Exit \n\nEnter Choice : ";
        cin>>ch;
        switch(ch){
            case 1 : obj.addMiniPizza();break;
            case 2 : obj.addGarlicBread();break;
            case 3 : obj.addChocoLavaCake();break;
            case 4 : obj.addPepsi();break;
            case 5 : obj.displayBill();break;
            case 6 : cout<<"\nExiting....... Thank you!";break;
        }

    }while(ch!=6);

    return 0;
}