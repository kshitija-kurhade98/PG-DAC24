/*Write a program, which accepts annual basic salary of an employee and calculates and displays the 
Income tax as per the following rules. 
Basic: < 1, 50,000 Tax = 0
 1, 50,000 to 3,00,000 Tax = 20% 
 > 3,00,000 Tax = 30% */
 #include<iostream>
 using namespace std;

 class Employee{
    private  : int salary; double tax;
    public : 
    
    Employee(int salary){
        this->salary = salary;
    }

    void calcTax(){
        if(salary<150000){
            tax = 0;
            cout<<"Tax : "<<tax;
        }
        else if(salary>150000 && salary<=300000){
            tax = 0.2 * salary;
            cout<<"Tax : "<<tax;
        }
        else{
            tax = 0.3 * salary;
            cout<<"Tax : "<<tax;
        }
    }
 };

 int main(){
    Employee obj(300000);
    obj.calcTax();
    return 0;
 }