
public class LinkedList implements List{
	
	private Node head;
	private int size;
	
	
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	public boolean set(Object o, int pos) {
		if (pos >= size) return false;
		Node curr = head;
		for (int i = 0; i< pos; i++) {
			curr = curr.getNext();
		}
		curr.setElt(o);
		return true;
	}
	
	public Object get(int pos) throws Exception{
		if (pos >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node curr = head;
		for (int i = 0; i< pos; i++) {
			curr = curr.getNext();
		}
		return curr.getElt();
	}
	public void add(Object o) {
		Node n = new Node(o);
		if(head == null) {
			head = n;
		}
		else {
			Node curr = head;
			for (int i = 0; i < size-1; i++) {
				curr = curr.getNext();
			}
			curr.setNext(n);
		}
		size++;
	}
	public void insert(Object o, int pos) throws Exception{
		if (pos > size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node n = new Node(o);
		if (pos == 0) {
			n.setNext(head);
			head = n;
		}
		else {
			Node curr = head;
			for (int i = 0; i < pos-1; i++) {
				curr = curr.getNext();
			}
			
			n.setNext(curr.getNext());
			curr.setNext(n);
		}
		size++;
	}
	public Object remove(int pos) throws Exception{ return null;}
	public boolean remove(Object o) { return true;}
	public int find(Object o) {
		Node curr = head;
		for (int i = 0; i< size; i++) {
			if (curr.getElt().equals(o)) {
				return i;
			}
			curr = curr.getNext();
			
		}
		return -1;
	}
	public int length() {
		return size;
	}
	public String toString() {
		String s = "";
		Node curr = head;
		for (int i = 0; i< size; i++) {
			s += curr.toString() + " ";
			curr = curr.getNext();
		}
		return s;
	}
	public void clear() {
		head = null;
		size = 0;
	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		for (int i = 2; i < 10; i++) {
			ll.add(i);
		}
		System.out.println(ll);
		System.out.println(ll.find(7));
		System.out.println(ll.set(11, 4));
		System.out.println(ll.set(12, 15));
		System.out.println(ll);
		try{ ll.insert(45, 0); }
		catch(Exception E) { System.out.println(E);}
		System.out.println(ll);
		
	}
}
