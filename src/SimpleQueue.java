import java.util.List;

public class SimpleQueue {
	
	public static String[] data;
	public static int size;
	
	public SimpleQueue() {
		data = new String[1];
		data[0] = "";
		size = 0;
	}
	
	public SimpleQueue(int initialCapacity) {
		data = new String[1];
		data[0] = "";
		size = 0;
	}
	
	public SimpleQueue(List<String> list) {
		
	}
	
	public static void main(String[] args) {
		
	}
	
	public boolean add(String s) {
		
	}
	
	public void clear() {
		
	}
	
	public String comparator() {
		
	}
	
	public contains(String s) {
		
	}
	
	public String element() {
		
	}
	
	public boolean offer(String s) {
		
	}
	
	public String peek() {
		
	}
	
	public String poll() {
		
	}
	
	public String remove() {
		
	}
	
	public String remove(String s) {
		
	}
	
	public String toString() {
		String concat = "[";
		for (int x = 0; x < data.length; x++) {
			if (data[x] != null) {
				concat += data[x];
				concat += ", ";
			}
		}
		concat = concat.substring(0,concat.length()-2);
		return concat += "]";
	}
}
