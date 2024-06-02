/*2:Create cpp application for bank account handling.
2.1. Create a class BankAccount -- acct no(int),customer name(string),balance(double)
Add  constr. (2 constrs : first to accept all details )

2.2 Add Business logic methods
Methods
public void withdraw(double amt) 
public void deposit(double amt)

2.3: Create object of account class and test withdraw and deposit methods.*/
#include<iostream>
using namespace std;

class Bank_acc{
    protected : int acc_no; double balance; string name;
    public : 
    Bank_acc(int acc_no, string name,double balance){
        this->acc_no = acc_no;
        this->name = name;
        this->balance = balance;
    }
    public : 
    void withdraw(double amount){
            balance = balance - amount;
            cout<<"Current Balance : "<<balance<<" after withdrawing "<<amount<<endl;
    }
    void deposit(double amount){
            balance = balance + amount;
            cout<<"Current Balance : "<<balance<<" after adding "<<amount<<endl;
    }

};

int main(){
    Bank_acc obj(8110,"Jitesh",50000);
    obj.deposit(1000);
    obj.withdraw(500);
    return 0;

}