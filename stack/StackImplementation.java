package stack;

import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

class Stacks{
	int top;
	int arr[];
	int capacity;
	
	public Stacks(int n ){
		arr=new int[n];
		top=-1;
		capacity=n;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==capacity-1;
	}
	public void push(int x){
		if(isFull()) {
			System.out.println("OverFlow!!!");
			return;
		}
		arr[++top]=x;
	}
	public int  pop() {
		if(isEmpty()) {
			System.out.println("UnderFlow!!!!!");
			return -1;
		}
		return arr[top--];
	}
	public String display() {
		return Arrays.toString(arr);
	}
	public int peek() {
		return arr[top];
	}
	public int  size() {
		return top+1;
	}
}

public class StackImplementation {

	public static void main(String[] args) {
		Stacks stacks=new Stacks(5);
		stacks.push(1);
		stacks.push(2);
		stacks.push(3);
		stacks.push(4);
		stacks.push(5);
		System.out.println(stacks.display());
		System.out.println("peek: "+stacks.peek());
		System.out.println("size: "+stacks.size());
	}
	

}
