
public class Search {
	public static void main(String[] args) {
		
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
		}
		java.util.Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			
		}
		System.out.println("The number of comparison is \n" + linearSearch(array, 6));
		System.out.println(binarySearch(array, 6));
		
	}
	public static int linearSearch(int[] list, int key) {
		
		int i;
		for (i = 0; i < list.length; i++) {
			
			if (key == list[i]) {
				System.out.println("\nNumber Found");
				
				return i;
			}
		}
		System.out.println("\nNumber not Found");
		return i;
	}
	
	public static boolean binarySearch(int[] list, int key) {
		return binarySearch(list, key, 0, list.length - 1, 0);
	}
	
	private static boolean binarySearch(int[] list, int key, int low, int high, int count) {
		count++;
		
		if (high < low) {
			System.out.println("\nNumber not Found");
			return false;
			
		}
		int mid = high + low / 2;
		
		if (key < list[mid]) {
			return binarySearch(list, key, low, mid - 1, count);
	
			}
		else if (key > list[mid]) {
			return binarySearch(list, key, mid + 1, high, count);
		
		}
		else {
			System.out.println("comparison\n" + count);
			return true;
			
		}
		
	}
}
