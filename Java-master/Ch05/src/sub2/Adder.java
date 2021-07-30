package sub2;

public class Adder {

	private int x;
	
	public Adder(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void add(int x) {
		this.x = x + 50;
	}
	
	public void add(int[] arr2) {
		arr2[0]++;
	}
	
	public void add(Adder a1) {
		a1.x = a1.x + 40;
	}
	
	public Adder addNew(Adder a2) {
		a2 = new Adder(1);
		return a2;
	}
}
