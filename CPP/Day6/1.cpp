/*assignment:Exception
create Stack class  for storing 10 numbers
create function push(int number)--->number will get stored in array
create function pop() will return top most number ,last added number

Note:Hadle StackFull and StackEmpty Exception
Stack s;//array[4];
s.push(10);s.push(20);s.push(30);//s.push(40); s.push(50);

int a=s.pop();//------> 30
  a=s.pop();//----->20
   a=s.pop();//------>10

s.pop();//*/

#include<iostream>
using namespace std;

class Stack{
    public : int top=-1; int size; 
             int* arr = new int(size);

    // void setSize(int size){
    //     this->size = size;
    // }

    int isFull(){
        if(top>size){
            return 1;
        }
    else{
        return 0;
    }
    }

    int isEmpty(){
        if(top==-1){
            return 1;
        }
        else{
            return 0;
        }
    }

    void push(){
        if(isFull()){
            cout<<"Stack Overflow ....!"<<endl;
        }
        else{
            int data;
            top++;
            cout<<"Enter Element["<<top<<"] : "<<endl;
            cin>>data;
            arr[top] = data;
            
        }
    }

    void pop(){
        if(isEmpty()){
            cout<<"Stack Underflow .....!"<<endl;
        }
        else{
            cout<<"\n\nPopped Element : "<<arr[top]<<endl;;
            arr[top] = 0;
            top--;
        }
    }

    void display(){
        cout<<"\n_________Stack Elements__________"<<endl;
        for(int i=0; i<=top; i++){
            cout<<arr[i]<<" ";
        }
    }

};

int main(){
    Stack s;

    // int size, i=0;
    // cout<<"Enter Stack size : "<<endl;
    // cin>>size;
    // s.setSize(size);



    // cout<<"Enter Stack size : "<<endl;
    // cin>>s.size;
    // int i=0;
    // while(i<s.size){
    //     s.push();
    //     i++;
    // }

    // s.display();

    // s.pop();

    // s.display();

    cout<<"Enter Stack size : "<<endl;
    cin>>s.size;

    int ch;
    do{
        cout<<"\n_________MENU________\n 1.push \n 2.pop \n 3.display \n 0. Exit \n";
        cout<<"Enter choice : "<<endl;
        cin>>ch;
        switch(ch){
            
            case 1 : s.push();break;
            case 2 : s.pop();break;
            case 3 : s.display();break;
            case 0 : cout<<"\nExiting____";break;
            default : cout<<"Invalid Choice"<<endl;
        }
    }while(ch!=0);
    





    return 0;
}