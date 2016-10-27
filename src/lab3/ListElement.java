package lab3;

public class ListElement {
	private ListElement next;
	
	private int data;
	
	
	public ListElement(int data){
		this.data = data;
		this.next = null;
		
	}
	
	
	
	public void setData(int data){
		this.data = data;
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setNext(ListElement next){
		this.next = next;
	}
	
	public ListElement getNext(){
		return this.next;
	}
	
	
	public void print(){
		System.out.println(this.data);
	}
}
