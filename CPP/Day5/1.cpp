/*1 Solve this.
Fresh business scenario to apply inheritance , polymorphism to emp based organization scenario.
Create Emp based organization structure --- Emp , Mgr , Worker

1.1 Emp state--- id(int), name, deptId , basicSalary(double)
Accept all of above in constructor arguments.
Methods ---
 compute net salary ---ret 0
(eg : public double computeNetSalary(){return 0;})

1.2 Mgr state  ---id,name,basic,deptId , perfBonus
Add suitable constructor
Methods ----
1. compute net salary (formula: basic+perfBonus) -- override computeNetSalary

1.3 Worker state  --id,name,basic,deptId,hoursWorked,hourlyRate
Methods : 
1.  compute net salary (formula:  = basic+(hoursWorked*hourlyRate) --override computeNetSalary
2. get hrlyRate of the worker  -- add a new method to return hourly rate of a worker.(getter)

Create suitable array to store organization details.
Provide following options
1. Hire Manager
I/P : all manager details

2. Hire Worker  
I/P : all worker details

3. Display information of all employees net salary (by invoking computeNetSal), 

4. Exit*/

#include<iostream>
using namespace std;

class Employee{
    private : int emp_id, dept_id;
              string name; 
    protected : double basic_salary;
    public :

    Employee(){
        emp_id = 0;
        dept_id = 1;
        name = "NoName";
        basic_salary = 10000;
    }

    Employee(int emp_id, string name, int dept_id, double basic_salary){
        this->emp_id = emp_id;
        this->name = name;
        this-> dept_id = dept_id;
        this-> basic_salary = basic_salary;
    }

    virtual double computeNetSalary(){
        cout<<"Basic Salary of Employee : "<<basic_salary<<endl;
        return 0;
    }

    virtual void displayDetails(){
        cout<<"Emp Id : "<<emp_id<<endl;
        cout<<"Name  : "<<name<<endl;
        cout<<"Dept_Id : "<<dept_id<<endl;
        cout<<"Basic Salary : "<<basic_salary<<endl;
    }
};

class Manager : public Employee{
    private : int perf_bonus,net_salary;              
    public :
    Manager(){
        perf_bonus = 0;
    }

    Manager(int emp_id, string name, int dept_id, double basic_salary,int bonus):Employee(emp_id,name,dept_id,basic_salary){
        perf_bonus = bonus;
    }

    double computeNetSalary(){
        net_salary = basic_salary+perf_bonus;
        return 0;
    }

    void displayDetails(){
        Employee::displayDetails();
        cout<<"Net Salary of Manager : "<<net_salary<<endl;
    }
    
};

class Worker : public Employee{
    protected : int hoursWorked , hourlyRate, net_salary;

    public : 
    Worker(){
        hoursWorked = 0;
        hourlyRate = 500;
    }

    Worker(int emp_id, string name, int dept_id, double basic_salary,int hoursWorked, int hourlyRate):Employee(emp_id,name,dept_id,basic_salary){
        this->hoursWorked = hoursWorked;
        this->hourlyRate = hourlyRate;
    }

    int getHourlyRate(){
        return hourlyRate;
    }

    double computeNetSalary(){
        net_salary = basic_salary+(hoursWorked*hourlyRate);
        cout<<"Net Salary : "<<net_salary<<endl;
        return 0;
    }

    void displayDetails(){
        Employee::displayDetails();
        cout<<"Net Salary of Worker : "<<net_salary<<endl;
    }


};

int main(){
    /*Manager mObj(101,"MXYZ",1,50000,15000);
    mObj.computeNetSalary();
    mObj.displayDetails();
    cout<<endl<<endl;
    Worker wObj(301,"WXYZ",3001,20000,10,500);
    /*wObj.computeNetSalary();
    wObj.displayDetails();

    Employee *arr[10];
    arr[0] = &mObj;
    arr[1] = &wObj;
    arr[1] ->computeNetSalary();
    arr[1] ->displayDetails();*/
    int ch,emp_id,dept_id,basic_salary,perf_bonus,hourlyRate,hourWorked,k;
    string name;
    Manager* m;
    Worker* w;
    do{
        
        cout<<"_________MENU_________\n";
        cout<<"\n 1. Hire Manager \n 2.Hire Worker \n 3.Display Details  \n 4.Exit \n";
        cout<<" Enter choice : "<<endl;
        cin>>ch;

        switch(ch)
        {
        case 1 : cout<<"Enter Emp_id :"<<endl;
                 cin>>emp_id;
                 cout<<"Enter EmpName :"<<endl;
                 cin>>name;
                 cout<<"Enter dept_id : "<<endl;
                 cin>>dept_id;
                 cout<<"Enetr Basic Salary : "<<endl;
                 cin>>basic_salary;
                 cout<<"Enetr Performance bonus : "<<endl;
                 cin>>perf_bonus;
                 m = new Manager(emp_id,name,dept_id,basic_salary,perf_bonus);
                 break;
        
        case 2 : cout<<"Enter Emp_id :"<<endl;
                 cin>>emp_id;
                 cout<<"Enter EmpName :"<<endl;
                 cin>>name;
                 cout<<"Enter dept_id : "<<endl;
                 cin>>dept_id;
                 cout<<"Enetr Basic Salary : "<<endl;
                 cin>>basic_salary;
                 cout<<"Enetr Hours Worked : "<<endl;
                 cin>>hourWorked;
                 cout<<"Enetr Hourly Rate : "<<endl;
                 cin>>hourlyRate;
                 w = new Worker(emp_id,name,dept_id,basic_salary,hourWorked,hourlyRate);
                 break;

        case 3 : cout<<"\n_________Employee Details ___________";
                 cout<<"\n 1. Manager Details  \n 2. Worker Details \n Press :";
                 cin>>k;
                 if(k==1){
                    m->computeNetSalary();
                    m->displayDetails();
                 }
                if(k==2){
                    w->computeNetSalary();
                    w->displayDetails();
                }
                break;

        case 4 : cout<<"Thank You !"; break;

        default : cout<<"Invalid Choice";
        
        
        }
    }while(ch != 4);

    return 0;
}