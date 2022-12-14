import java.util.*;
import java.util.regex.Pattern;

public class Calculator {
	public static void main(String args[]) {
		String pattern = "(1[0]|[1-9])[+-/*](1[0]|[1-9])[+-/*]?(1[0]|[1-9]?)";
		String input = "";
		boolean val = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Enter input in the given format below-----");
		System.out.println("a+b-c, a-b+c, a*b-c, a/b*c");
		System.out.println("Enter Mathmatical Expression using any of [+-*/] these operators with operands within the range of 1-10 inclusive");
		input = sc.nextLine();
		val = Pattern.matches(pattern, input);
		sc.close();
		
		if(val) {
			new Extract(input);
		}
		else {
			System.out.println("InValid Input");
		}
		
	}
}
