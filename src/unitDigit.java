import java.util.Scanner;

public class unitDigit {

	public static void main(String[] args) {
		Scanner Digit = new Scanner(System.in);
		System.out.println("Enter Number in Digits");
		int num = Digit.nextInt();
		switch (num) {
		case 1:
			System.out.println("once");
			break;
		case 10:
			System.out.println("Tense");
			break;
		case 100:
			System.out.println("Hundered");
			break;
		case 1000:
			System.out.println("Thousand");
			break;
		default:
			System.out.println("Be in your limit");
		}
	}

}
