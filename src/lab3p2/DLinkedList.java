package lab3p2;

import java.util.Scanner;

public class DLinkedList {
	public DListElement head;
	public DListElement tail;
	public int size=0;
	public void addElement(DListElement le)
	{
		if (head==null)
		{
			
			head = le;
			tail = head;
		}
		else{
			DListElement current =head;
							
			while(current.getNext()!=null)
			{
				current=current.getNext();
			}
			current.setNext(le);
			le.setPrev(current);
			tail=le;
			size++;
		
		}
	}
	public DListElement getElement(int index)
	{
		if(index<0)
			return null;
		DListElement current =null;
		if(head!=null)
		{
			current = head.getNext();
			for(int i = 1; i<index;i++)
			{
				if(current.getNext()==null)
					return null;
				current=current.getNext();
				
			}
			System.out.println(current.getData());
		}
		return current;
	}
	public DListElement deleteElement(int index)
	{
		
			
			if (index < 0 || index >= size) {
	            System.out.println("out of range");
				return null;
	        } else if (index == 0) {
	            head = head.getNext();
	            head.setPrev(null);
	         
	        } else if (index == size - 1) {
	            tail = tail.getPrev();
	            tail.setNext(null);
	            size--;
	        } else {
	        	DListElement current = head;
	            for (int i = 0; i < index; i++) {
	                current = current.getNext();
	            }
	            DListElement previous = current.getPrev();
	            DListElement next = current.getNext();
	            previous.setNext(current.getNext());
	            next.setPrev(previous);
	            size--;
	        }
			return null;
	}
	public void printLinkedListHead()
	{
		DListElement current=head;
		while(current!=null){
			current.print();
			current=current.getNext();
		}
	}
	public void printLinkedListTail()
	{
		DListElement current=tail;
		
		while(current!=null){
			current.print();
			current=current.getPrev();
		}
		
	}
	public static void main(String[] args) {
		
		
		DLinkedList dlist = new DLinkedList();
		DListElement a = new DListElement(5);
		DListElement b = new DListElement(6);
		DListElement c = new DListElement(7);
		DListElement d = new DListElement(8);
		dlist.addElement(a);
		dlist.addElement(b);
		dlist.addElement(c);
		dlist.addElement(d);
		System.out.println("Print list");
		dlist.printLinkedListHead();
		System.out.println("get element in index 2");
		dlist.getElement(2);
		System.out.println("delete element in index 1");
		dlist.deleteElement(1);
		System.out.println("Print list");
		dlist.printLinkedListHead();
		System.out.println("Print list from tail");
		dlist.printLinkedListTail();
		
	}

}
