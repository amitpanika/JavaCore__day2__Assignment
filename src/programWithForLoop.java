import java.util.Scanner;

public class programWithForLoop {

	public static void main(String[] args) {

		int num, sum = 0;
		System.out.println("Enter the number of term");
		Scanner Scanner = new Scanner(System.in);
		num = Scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("ADDITION" + " " + sum);
	}

}
