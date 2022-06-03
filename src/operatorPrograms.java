import java.util.Scanner;

public class operatorPrograms {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x");
        int x = scan.nextInt();
        System.out.println("Enter the value of y");
        int y = scan.nextInt();
        double dis = Math.sqrt(x*y+y*y);
        System.out.println("Euclidean distance"+" "+(x*y+y*y) );
        
	}

}
