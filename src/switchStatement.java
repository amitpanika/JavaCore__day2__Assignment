import java.util.Scanner;

public class switchStatement {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the month");

		int month = Scanner.nextInt();
		switch (month) {
		case 1:
			System.out.println("JANUARY");
			break;
		case 2:
			System.out.println("FEBUARY");
			break;
		case 3:
			System.out.println("MARCH");
			break;
		case 4:
			System.out.println("APRIL");
			break;
		case 5:
			System.out.println("MAY");
			break;
		case 6:
			System.out.println("JUNE");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("AUGUST");
			break;
		case 9:
			System.out.println("SEPTEMBER");
			break;
		case 10:
			System.out.println("OCTOBER");
			break;
		case 11:
			System.out.println("NOVEMBER");
			break;
		case 12:
			System.out.println("DECEMBER");
			break;
		}

	}
}
