
public class DoublyLinkedList implements List{
	private DNode head;
	private DNode tail;
	private int size;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public boolean set(Object o, int pos) {
		
	}
	
	public Object get(int pos) throws Exception{
		if (pos >= size) {
			throw new IndexOutOfBoundsException();
		}
		DNode curr;
		if (pos < size/2) {
			curr = head;
			for(int i = 0;i < pos; i++) {
				curr = curr.getNext();
			}	
		}
		else {
			curr = tail;
			for(int i = 0;i < size-pos-1; i++) {
				curr = curr.getPrev();
			}	
		}
		return curr.getElt();
	}
	
	public void add(Object o) {
		DNode newNode = new DNode(o);

		if (size == 0) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.setNext(newNode);
			newNode.setPrev(tail);
			tail = newNode;
		}
		size++;
	}
	public void insert(Object o, int pos) throws Exception{
		
	}
	public Object remove(int pos) throws Exception{ 
		if (pos >= size) {
			throw new IndexOutOfBoundsException();
		}
		Object toReturn;
		// check head and tail
		if(pos == 0) {
			toReturn = head.getElt();
			head = head.getNext();
			head.setPrev(null);
		}
		
		else if(pos == size-1) {
			toReturn = tail.getElt();
			tail = tail.getPrev();
			tail.setNext(null);
		}
		
		else {
			DNode curr;
			if (pos < size/2) {
				curr = head;
				for(int i = 0;i < pos; i++) {
					curr = curr.getNext();
				}	
			}
			else {
				curr = tail;
				for(int i = 0;i < size-pos-1; i++) {
					curr = curr.getPrev();
				}	
			}
			// curr is the thing to remove
			toReturn = curr.getElt();
			//set the next of thing before curr to curr.getNext()
			curr.getPrev().setNext(curr.getNext());
			//set the prev of thing after curr to curr.getPrev()
			curr.getNext().setPrev(curr.getPrev());
		}
		// size update
		size--;
		// return statement
		return toReturn;
		return null;
	}
	public boolean remove(Object o) { 
		return true;
	}
	public int find(Object o) {
		DNode curr = head;
		for(int i = 0; i<size; i++) {
			if(curr.getElt().equals(o)) {
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
		DNode curr = head;
		for (int i = 0; i< size; i++) {
			s += curr.toString() + " ";
			curr = curr.getNext();
		}
		return s;
	
	}
	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}
	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();
		for (int i = 0; i < 10; i++) dl.add(i);
		System.out.println(dl);
		System.out.println(dl.find(7));
		try {
			System.out.println(dl.get(4));
		} catch(Exception E) { System.out.println(E); }
	}
}
