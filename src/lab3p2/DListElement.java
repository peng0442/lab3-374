package lab3p2;



public class DListElement {
	private DListElement prev;
	private DListElement next;
	private int data;
	
	
	public DListElement(int data){
		this.data = data;
		this.prev = null;
		this.next = null;
		
	}
	
	
	
	public void setData(int data){
		this.data = data;
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setPrev(DListElement prev){
		this.prev = prev;
	}
	
	public DListElement getPrev(){
		return this.prev;
	}
	public void setNext(DListElement next){
		this.next = next;
	}
	
	public DListElement getNext(){
		return this.next;
	}
	
	
	public void print(){
		System.out.println(this.data);
	}
}
