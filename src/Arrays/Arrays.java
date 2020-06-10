package Arrays;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		int[] myIntArray = {0,10,20,30,40,50,60,70,80,90,100};
		
		for(int i = 0; i <myIntArray.length; i++) {
			myIntArray[i] = myIntArray[i] * 10;
		}
		for(int i = 0; i < myIntArray.length; i++) {
			System.out.println("element " + i + ", value is " + myIntArray[i]);
		}
		
	}
		
}
