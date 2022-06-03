import java.util.Scanner;

public class arithematicOperator {

  /*
  *  ARITHEMATIC OPERTATION..................... 
  *  FIRST ADDITION (A+B);
  *  SECOND SUBTRACTION (A-B);
  *  THIRD MULTIPLICATION (A*B);
  *  FOURTH DIVISION (A/B);
  */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x");
		int a = sc.nextInt();
		System.out.println("Enter the value of y");
		int b = sc.nextInt();
		System.out.println("Addition" + " " + (a + b));
		System.out.println("Subtraction" + " " + (a - b));
		System.out.println("Multiplication" + " " + (a * b));
		System.out.println("Division" + " " + (a / b));

	}

}
