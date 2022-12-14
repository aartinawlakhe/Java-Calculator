import java.util.*;

public class Extract {
	String digit = "";
	ArrayList<String> list = new ArrayList<String>();
	
	Extract(String input){
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == '+' || input.charAt(i) == '-' ||
				input.charAt(i) == '*' || input.charAt(i) == '/') {
				list.add(digit);
				digit = "";
				digit += input.charAt(i);
				list.add(digit);
				digit = "";
			}
			else {
				digit += input.charAt(i);				
			}
		}
		list.add(digit);
		
		new Operation(list).displayResult();
	}
}
