public class MyInteger {
	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return isEven(this.value);
	}
	
	public boolean isOdd() {
		return isOdd(this.value);
	}
	
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		else
			return false;
	}
	
	public static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		}
		else
			return false;
	}
}
