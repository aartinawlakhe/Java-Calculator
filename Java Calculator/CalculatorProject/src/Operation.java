import java.util.*;

public class Operation {
	int output = 0, ind = 0;
	
	Operation(ArrayList<String> list){
		
		try {
			while(list.size() > 1) {
				if(list.contains("*")) {
					ind = list.indexOf("*");
					Multiplication mul = new Multiplication();
					output = mul.multiply(Integer.parseInt(list.get(ind-1)), Integer.parseInt(list.get(ind+1)));
					list.remove(ind+1);
					list.remove(ind);
					list.set(ind-1, Integer.toString(output));
				}
				else if(list.contains("/")) {
					ind = list.indexOf("/");
					Division div = new Division();
					output = div.divide(Integer.parseInt(list.get(ind-1)), Integer.parseInt(list.get(ind+1)));
					list.remove(ind+1);
					list.remove(ind);
					list.set(ind-1, Integer.toString(output));
				}
				else if(list.contains("+")) {
					ind = list.indexOf("+");
					Addition add = new Addition();
					output = add.add(Integer.parseInt(list.get(ind-1)), Integer.parseInt(list.get(ind+1)));
					list.remove(ind+1);
					list.remove(ind);
					list.set(ind-1, Integer.toString(output));
				}
				else if(list.contains("-")) {
					ind = list.indexOf("-");
					Substraction sub = new Substraction();
					output = sub.substract(Integer.parseInt(list.get(ind-1)), Integer.parseInt(list.get(ind+1)));
					list.remove(ind+1);
					list.remove(ind);
					list.set(ind-1,Integer.toString(output));
				}
			}
		}
		catch(NumberFormatException e) {
			System.out.println("InValid Input");
		}
	}
	
	void displayResult() {
		System.out.println("Result");
		System.out.println(output);
	}
}
