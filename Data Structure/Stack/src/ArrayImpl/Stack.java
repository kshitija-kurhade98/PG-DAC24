package ArrayImpl;

public class Stack {

	int[] arr;
	int size;
	int top;
	
	public Stack(int size) {
		super();
		this.size = size;
		top = -1;
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == (size-1);
	}
	
	public boolean push(int data) {
		if(isFull()) {
			System.out.println("\nCant push.. Stack is full!");
			return false;
		}
		
		top++;
		arr[top] = data;
		return true;
	}
	
	public boolean pop() {
		
		if(isEmpty()) {
			System.out.println("\nCant Pop ...Stack is Empty!");
			return false;
		}
		
		System.out.println("Popped Elem :"+arr[top]);
		arr[top]=0;
		top--;
		return true;
		
	}
	
	public void display() {
		System.out.println("\n------------ Stack Elem -------------");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
	}
	
}
