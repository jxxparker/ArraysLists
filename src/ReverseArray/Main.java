package ReverseArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	private static void reverse(int[] array) {
		int maxIndex = array.length - 1;
		int halfLength = array.length /2;
		for(int i = 0; i < halfLength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex -i];
		}
		
	}
}
