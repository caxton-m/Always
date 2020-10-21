
public class SuperStack <T>{
	private T[] items;
	private int top;
	
	public SuperStack <T> (int size) {
		items = (T[]) new Object[size];
	}
	
	public boolean isEmpty() {
		// TODO
		return true;
	}
	
	public boolean isFull() {
		return false;
	}

}
