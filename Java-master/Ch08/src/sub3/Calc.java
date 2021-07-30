package sub3;

public class Calc {

	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) throws Exception {
		
		if(y == 0) {
			Exception e1 = new Exception("y는 0이 되어서는 안됩니다.");
			throw e1;
		}else if(y < 0) {
			Exception e2 = new Exception("y는 음수가 되면 안됩니다.");
			throw e2;
		}
		
		return x / y;
	}
}







