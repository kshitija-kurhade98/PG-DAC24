package ArrayImpl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size : ");
		int size = sc.nextInt();
		
		Stack stack = new Stack(size);
		
//		int i=0, data;
		
//		while(i<size) {
//			System.out.println("Enter Element "+i+" : ");
//			data = sc.nextInt();
//			stack.push(data);
//		}
		
		stack.push(20);
		stack.push(51);
		stack.push(100);
		
		stack.display();
		
		stack.pop();
		stack.pop();
		stack.display();
		
		stack.push(200);
		stack.push(607);
		stack.display();
		

	}

}
