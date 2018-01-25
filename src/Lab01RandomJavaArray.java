import java.util.*;

public class Lab01RandomJavaArray {

	public static void main(String[] args) {
		//creates an int array of length 100
		int[] randomNumberArray = new int[100];
		
		Scanner userInput = new Scanner(System.in);
		
		//fills the array with random values
		for (int i = 0; i < 100; i++) {
			randomNumberArray[i] = (int)(Math.random() * 100 + 1);
		}
		
		//debug note: simple array initialization check
		/*
		System.out.println(Arrays.toString(randomNumberArray));
		*/
		
		System.out.println("Enter a number between 1 and 100 to check if it exists in the array: ");
		
		int value = userInput.nextInt();
		
		for (int i = 0; i < 100; i++) {
			if(randomNumberArray[i] == value) {
				System.out.println("Your number is matched at index " + (i + 1));
				break;
			} else if (i == 99) {
				System.out.println("No match found.");
			}
		}
		
		System.out.println("Exiting...");
		System.exit(0);
	}

}
