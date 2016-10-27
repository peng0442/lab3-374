package lab3;

public class ListElement {
	private ListElement next;
	private ListElement previous;
	private int data;
	
	
	public ListElement(){
		this.data = 0;
		this.next = null;
		this.previous = null;
	}
	
	public void setNext(ListElement next){
		this.next = next;
	}
	
	public ListElement getNext(){
		return next;
	}
	
	public void setData(int data1){
		data = data1;
	}
	
	public int getData(){
		return data;
	}
	
	public void setPrevious(ListElement previous){
		this.previous = previous;
	}
	
	public ListElement getPrevious(){
		return previous;
	}
	
	public void display(){
		System.out.println(this.data);
	}
}
