package stack;

import java.awt.image.RescaleOp;
import java.util.Arrays;


class Queues{
	int front;
	int rear;
	int maxCapacity;
	int cnt;
	int arr[];
	public Queues(int n) {
		arr=new int[n];
		front=0;
		rear=-1;
		cnt=0;
		maxCapacity=n;
	}
	
	public void push(int x) {
		if(cnt==maxCapacity) {
			System.out.println("Overflow!!!");
			return ;
		}
		if(cnt==0) {
			front=0;
			rear=0;
		}
		else{
			rear=(rear+1)%maxCapacity;
		}
		arr[rear]=x;
		cnt++;
	}
	public int  pop() {
		if(front==-1) {
			System.out.println("UnderFlow!!!");
			return -1;
		}
		int poped=arr[front];
		if(cnt==0) {
			front=-1;
			rear=-1;
		}
		else {
			front=(front+1)%maxCapacity;
		}
		cnt--;
		return poped;
	}
	public String display() {
		return Arrays.toString(arr);
	}
}

public class QueueImplementation {

	public static void main(String[] args) {
		
		Queues q=new Queues(5);
		q.push(1);
		q.push(2);
		q.push(1);;
		q.push(3);
		System.out.println(q.pop());
		q.pop();
		System.out.println(q.display());

	}

}
