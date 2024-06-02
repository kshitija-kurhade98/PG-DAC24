/*7. Write a menu driven program to do following operations :
a) Compute area of circle
b) Compute area of rectangle
c) Compute area of triangle
d) Exit
Display menu, ask choice to the user, depending on choice accept the parameters and perform the 
operation. Continue this process until user selects exit option.
*/

#include<iostream>
using namespace std;

class shape{
    protected : double area_res;
    public: 
    virtual void area()=0;
};

class circle : public shape{
    public: int r;
    circle(){
        r=1;
    }
    void area(){
        area_res = 3.14 * r *r;
        cout<<"Area of Circle : "<<area_res;
    }
};

class Rectangle : public shape{
    public: int l,b;
    Rectangle(){
        l = 1;
        b = 1;
    }
    void area(){
        area_res = l*b;
        cout<<"Area of Rectangle : "<<area_res;
    }
};

class Triangle : public shape{
    public: int b,h;
    Triangle(){
        h = 1;
        b = 1;
    }
    void area(){
        area_res = 0.5*b*h;
        cout<<"Area of Rectangle : "<<area_res;
    }
};


int main(){
    shape *sptr;
    char ch;
    // circle c_obj;
    // sptr = &c_obj;
    // sptr ->area();
    circle c_obj;
    Rectangle r_obj;
    Triangle t_obj;
    do
    {
        cout<<"\n\n_____Menu______ \na)Area of Circle \nb)Area of Rectangle \nc)Area of Triangle \nd)Exit \nEnter Choice : "<<endl;
        cin>>ch;
        switch (ch)
        {
        case 'a' : 
                    
                    cout<<"Enter radius : "<<endl;
                    cin>>c_obj.r;
                    sptr = &c_obj;
                    sptr -> area();
                    break;
        
        case 'b':
                    
                    cout<<"Enter Length and Breadth: "<<endl;
                    cin>>r_obj.l>>r_obj.b;
                    sptr = &r_obj;
                    sptr -> area();
                    break;

         case 'c' :
                    
                    cout<<"Enter Base and Height: "<<endl;
                    cin>>t_obj.b>>t_obj.h;
                    sptr = &t_obj;
                    sptr -> area();
                    break;

        case  'd' :
                    cout<<"Exiting____"<<endl; break;

        
        default: 
                    cout<<"Invalid choice"<<endl;
                    break;
        }
    } while (ch!='d');

    return 0;
    
}