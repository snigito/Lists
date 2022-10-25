
public interface List {
	boolean set(Object o, int pos);
	Object get(int pos) throws Exception;
	void add(Object o);
	void insert(Object o, int pos) throws Exception;
	Object remove(int pos) throws Exception;
	boolean remove(Object o);
	int find(Object o);
	int length();
	String toString();
	void clear();
}
