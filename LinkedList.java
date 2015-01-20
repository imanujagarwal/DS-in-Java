import java.util.*;
import java.lang.*;
import java.io.*;

class node
{
	public int data;
	public node next;
	
	public node(int data)
        {
	this.data=data;
	}
	
	 
}

class list
{
	public node first;
		
	public list(){
	  first = null;
	}
		
	public void insert(int data){
	  node nnode= new node(data);
	  nnode.next = first;
	  first = nnode;
	}
		
	public void display(){
	  node current = first;
	  while(current != null){
		System.out.print(" " + current.data);
		current = current.next;
		}
	}
		
	public void nth(int n){
	  int counter=0;
	  node current= first;
	   while(current != null){
		counter++;
		}
	   int frmbeg = counter-n+1;
	   node ac=first;
	   int count=0;
	    while( count!=frmbeg){
		ac=ac.next;		
		}
	     System.out.print(ac.data);
	}
}

class llapp{
	
	public static void main(String args[]){
		list newlist = new list();
		newlist.insert(55);
		newlist.insert(75);
		newlist.insert(25);
		newlist.insert(77);
		newlist.insert(99);
		newlist.display();
		newlist.nth(2);
		newlist.display();
	}
}
