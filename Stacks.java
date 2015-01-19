import java.util.*;
import java.lang.*;
import java.io.*;

class stackx{
	public int[] arr;
	public int capacity;
	public int top;
	
	public stackx(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
		top = -1;
		
		
		
	}
	public boolean isfull(){
		if(top+1 == capacity) return true;
		else return false;
	}
	public boolean isempty(){
		if(top==-1)return true;
		else return false;
	}
	
	public void push(int data){
		arr[++top] = data;
	}
	
	public int pop(){
		return arr[top--];
	}
	
	public void display(){
		while(!this.isempty()){
			int temp = pop();
			System.out.println(temp);
			System.out.print("");
		}
	}
}	

class stackapp{
	public static void main(String args[]){
		stackx astack = new stackx(20);
		astack.push(5);
		astack.push(25);
		astack.push(38);
		astack.display();
		System.out.println(astack.capacity);
	}
}	