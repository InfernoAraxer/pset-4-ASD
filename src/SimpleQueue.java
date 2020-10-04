import java.util.NoSuchElementException;

public class SimpleQueue {
	
	public static String[] data;
	public static int size;
	public static int capacity;
	public String head = null;
	public String tail = null;
	public static int index = -1;
	
	public SimpleQueue(int initialCapacity) {
		if (initialCapacity <= 0) throw new IllegalArgumentException();
		data = new String[initialCapacity];
		size = 0;
		capacity = initialCapacity;
	}
	
	public static void main(String[] args) {
		
	}
	
	public boolean add(String s) {
		if (size == capacity) {
			throw new IllegalStateException("Queue full");
		}
		if (s == null) throw new NullPointerException();
		if (size == 0) head = s;
		data[size] = s;
		tail = s;
		size++;
		return true;
	}
	
	public void clear() {
		data = new String[capacity];
		size = 0;
	}

	public boolean contains(String s) {
		for (int x = 0; x < size; x++) {
			if (data[x] == s) return true;
			x++;
		}
		return false;
	}
	
	public String element() {
		if (head == null) {
			throw new NoSuchElementException();
		} else {
			return head;
		}
	}
	
	public boolean offer(String s) {
		if (size == capacity) {
			return false;
		}
		if (s == null) throw new NullPointerException();
		if (size == 0) head = s;
		data[size] = s;
		tail = s;
		size++;
		return true;
	}
	
	public String peek() {
		return head;
	}
	
	public String poll() {
		String poll = (size == 0) ? null : head;
		if (poll == null) {
			return poll;
		} else {
			String removed = data[0];
			data[0] = null;
			head = data[1];
			removeExtraBackSpace();
			return removed;
		}
	}
	
	public String remove() {
		if (size == 0) throw new NoSuchElementException();
		String removed = data[0];
		data[0] = null;
		head = data[1];
		removeExtraBackSpace();
		return removed;
	}
	
	public boolean remove(String s) {
		index = -1;
		String[] temp = new String[capacity];
		for (int x = 0; x < size; x++) {
			if (data[x] == s) {
				index = x;
			}
		}
		if (index == -1) return false;
		for (int y = 0; y < size; y++) {
			if (y < index) {
				temp[y] = data[y];
			} else if (y > index) { 
				temp[y - 1] = data[y];
			}
		}
		data = temp;
		size--;
		return true;
		
	}
	
	public int remainingCapacity() {
		return capacity - size;
	}
	
	public int size() {
		return size;
	}
	
	public String toString() {
		String concat = "[";
		for (int x = 0; x < size - 1; x++) {
			if (data[x] != null) {
				concat += data[x] + ", ";
			}
		}
		concat += (size != 0) ? data[size - 1] + "]" : "]" ;
		return concat;
	}


	public void removeExtraBackSpace() {
		String[] temp = new String[capacity];
		for(int z = 0; z < size; z++) {
			temp[z] = data[z + 1];
		}
		data = new String[capacity];
		data = temp;
		size--;
	}
}

