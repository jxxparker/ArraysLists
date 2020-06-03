package Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myIntArray = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		for(int i = 0; i < myIntArray.length; i++) {
			myIntArray[i] = myIntArray[i] * 10;
			System.out.println("element " + i + " value is " + myIntArray[i]);
		}

	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = array[i] * 10;
			System.out.println("element " + i + " value is " + array[i]);
		}
	}
		
}


