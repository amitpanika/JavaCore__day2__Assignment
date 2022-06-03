
import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {
	    
		char ch;
		System.out.println("Enter The Letter");
		Scanner Letter = new Scanner(System.in);
	    ch = Letter.next().charAt(0);
		if(ch =='a'|| ch =='e' || ch =='i' || ch =='o'|| ch =='u' ) {
			
			System.out.println("vowel");
		}
		else
			System.out.println(" Consonent");
	  }

}
