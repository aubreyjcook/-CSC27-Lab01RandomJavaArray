import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Lab01RandomJavaArray {

	public static void main(String[] args) {
		//creates an int array of length 100
		int[] randomNumberArray = new int[100];
		
		//fills the array with random values
		for (int i = 0; i < 100; i++) {
			randomNumberArray[i] = (int)(Math.random() * 100 + 1);
		}
		
		//debug note: simple array initialization check
		/*
		System.out.println(Arrays.toString(randomNumberArray));
		*/
		
	}

}
