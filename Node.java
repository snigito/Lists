
public class Node {
	private Object element;
	private Node next;
	
	Node(Object elt, Node next){
		element = elt;
		this.next = next;
	}
	
	Node(Object elt){
		element = elt; 
		next = null;
	}
	
	Node(){
		element = null;
		next = null;
	}
	
	public Node getNext() { return next; }
	
	public Object getElt() { return element; }
	
	public void setNext(Node nxt) { next = nxt; }
	
	public void setElt(Object elt) { element = elt; }
	public String toString() { return element.toString(); }
	
}
