package ReferenceTypes;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int myIntValue = 10;
		int anotherIntValue = myIntValue;
		
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("anotherIntValue = " + anotherIntValue );
		
		anotherIntValue++;
		
		System.out.println("new int value " + myIntValue);
		System.out.println("new another value " + anotherIntValue );
		
		int[] myIntArray = new int[5];
		int[] anotherArray = myIntArray;
		
		System.out.println("myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("anotherArray = " + Arrays.toString(anotherArray));
		
		anotherArray[0] = 1;
		
		System.out.println("after changed anotherArray = " + Arrays.toString(anotherArray));
		
		
		

	}

}
