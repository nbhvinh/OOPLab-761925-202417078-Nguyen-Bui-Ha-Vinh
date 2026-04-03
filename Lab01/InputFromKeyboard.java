import java.util.Scanner;
public class InputFromKeyboard {
	public static void main(String args[]) {
		Scanner kboard = new Scanner(System.in);
		
		System.out.println("Wat ur name?");
		String sname = kboard.nextLine();
		System.out.println("How od are you?");
		int iage = kboard.nextInt();
		System.out.println("How tall are you?");
		double dHeight = kboard.nextDouble();
		
		System.out.println("Mrs/Ms. " + sname + ", " + iage + " years old. " + "\nYour Height is " + dHeight + ".");
		
	}
}
