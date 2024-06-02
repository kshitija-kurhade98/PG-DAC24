/*3:Create a abstract class Shape with pure virtual method area;
Create Rectangle,Circle,Square class..inherit them from Shape class..Override area method.
Test these all classes by creating object of respective class.*/

#include<iostream>
using namespace std;

class Shape{
    protected : double area;
    public:
    virtual void Calcarea() = 0;
};

class Rectangle : public Shape{
    int length=10,width=5;
    public :
    void Calcarea(){
        area = length * width;
        cout<<"Area of Rectangle : "<<area<<endl;
    }

};

class  Circle : public Shape{
    int r =5;
    public : 
    void Calcarea(){
        area = 3.14 * r* r;
        cout<<"Area of Circle : "<<area<<endl;
    }

};

class Square : public Shape{
    int side = 20;
    public :
    void Calcarea(){
        area = side*side;
        cout<<"Area of Square : "<<area<<endl;
    }
};

int main(){
    Rectangle rect;
    rect.Calcarea();

    Circle circ;
    circ.Calcarea();

    Square sq;
    sq.Calcarea();

    return 0;
}