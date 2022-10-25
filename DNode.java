
public class DNode {
	private Object element;
	private DNode next;
	private DNode prev;
	
	DNode(Object elt, DNode next, DNode prev){
		element = elt;
		this.next = next;
		this.prev = prev;
	}
	
	DNode(Object elt){
		element = elt; 
		next = null;
		prev = null;
	}
	
	
	public DNode getNext() { return next; }
	
	public DNode getPrev() { return prev; }
	
	public Object getElt() { return element; }
	
	public void setNext(DNode nxt) { next = nxt; }
	public void setPrev(DNode prev) { this.prev = prev; }
	public void setElt(Object elt) { element = elt; }
	public String toString() { return element.toString(); }
	
}
