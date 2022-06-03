import java.util.Scanner;

public class SingleDigit {

	/*
	 * THIS IS MY FIRST PROGRAM READ A SINGE DIGIT NUMBER AND WRITE IN NUMBER
	 * 
	 */

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner Scan = new Scanner(System.in);
		int digit = Scan.nextInt();
		int num = 0;
		if (digit == 1) {
			System.out.println("one");
		} else if (digit == 2) {
			System.out.println("two");
		} else if (digit == 3) {
			System.out.println("Three");
		} else if (digit == 4) {
			System.out.println("Four");
		} else if (digit == 5) {
			System.out.println("Five");
		} else if (digit == 6) {
			System.out.println("Six");
		} else if (digit == 7) {
			System.out.println("Seven");
		} else if (digit == 8) {
			System.out.println("Eight");
		} else if (digit == 7) {
			System.out.println("Nine");
		}
	}
}