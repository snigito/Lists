
public class ArrayBasedList implements List {
	// instance variables
	private Object[] array;
	private int size;
	
	//constructors
	public ArrayBasedList() {
		array = new Object[10];
		size = 0;
	}
	
	public ArrayBasedList(int capacity) {
		array = new Object[capacity];
		size = 0;
	}
	
	public boolean set(Object o, int pos) {
		if (pos >= size) return false;
		array[pos] = o;
		return true;
	}
	
	public Object get(int pos) throws IndexOutOfBoundsException {
		if (pos >= size) throw new IndexOutOfBoundsException();
		return array[pos];
	}
	public void add(Object o) {
		
		if(++size > array.length) {
			Object[] array2 = new Object[array.length + 11];
			for(int g = 0; g < array.length; g++) {
				array2[g] = array[g];
			}
			array = array2;
		}
		array[size-1] = o;
	}
	public void insert(Object o, int pos) throws IndexOutOfBoundsException {
		// if the user enters pos that is inside capacity but greater than size  ***
		if (pos > size) throw new IndexOutOfBoundsException();
		if(++size > array.length) {
			Object[] array2 = new Object[array.length + 11];
			for(int g = 0; g < array.length; g++) {
				array2[g] = array[g];
			}
			array = array2;
		}
		for(int m = size-2; m >= pos; m--) {
			array[m+1] = array[m];
		}
		array[pos] = o;
	}
	public Object remove(int pos) throws IndexOutOfBoundsException { 
		if (pos >= size) throw new IndexOutOfBoundsException();
		Object temp = array[pos];
		for (int c = pos; c < size - 1; c++) {
			array[c] = array[c + 1];
		}
		array[--size] = null;
		return temp;
	}
	
	public boolean remove(Object o) {
		for(int m = 0; m < size; m++) {
			if(array[m].equals(o)) {
				this.remove(m);
				return true;
			}
		}
		return false;
	}
	
	
	public int find(Object o) {
		for (int b = 0; b < size; b++) {
			if (array[b].equals(o)) return b;
		}
		return -1;
	}
	public int length() {
		return size;
	}
	public String toString() {
		String s = "";
		for(int a = 0; a < size; a++){
			s += array[a].toString() + " ";
		}
		return s;
	}
	public void clear() {
		array = new Object[10];
		size = 0;
		
	}
	
	public static void main(String[] args) {
		ArrayBasedList abl = new ArrayBasedList();
		for (int i = 0; i < 10; i++) {
			abl.add(i);
		}
//		System.out.println(abl.length());
//		System.out.println(abl.get(9));
//		abl.insert(47, 5);
//		System.out.println(abl);
		abl.set(13, 5);
//		System.out.println(abl);
//		System.out.println(abl.find(6));
		System.out.println(abl);
		System.out.println(abl.remove(3));
		System.out.println(abl);
		System.out.println(abl.remove((Integer) 13));
		System.out.println(abl);
		
	}
}
