package lab3;

public class LinkedList 
{
	public ListElement head;
	
	public void addElement(ListElement le)
	{
		if (head==null)
		{
			head = le;
		}
		
		
		else{
			ListElement current =head;
			
			
		
			while(current.getNext()!=null)
			{
				current=current.getNext();
			}
			current.setNext(le);
		
		}
	}


public ListElement getElement(int index)
{
	if(index<0)
		return null;
	ListElement current =null;
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

public ListElement deleteElement(int index)
{
	ListElement current = head;
	if(current!=null)
	{
		for (int i =1;i<index;i++)
		{
			if(current.getNext()==null)
				return null;
			current=current.getNext();
			
		}
		current.setNext(current.getNext().getNext());
	}
		return null;
}

public void printLinkedListHead()
{
	
	while(head!=null){
		head.print();
		head=head.getNext();
	}
}
public void printLinkedListTail()
{
	if (head == null)
	      return;
	 head.print();
	 printLinkedListTail();
	   
}

public static void main(String[] args) {
	
	
	LinkedList list = new LinkedList();
	ListElement a = new ListElement(1);
	ListElement b = new ListElement(2);
	ListElement c = new ListElement(3);
	ListElement d = new ListElement(4);
	list.addElement(a);
	list.addElement(b);
	list.addElement(c);
	list.addElement(d);
//	list.printLinkedListHead();
	
//	list.getElement(2);
	
//	list.deleteElement(1);
	
	list.printLinkedListHead();
//	list.printLinkedListTail();
}
	




}