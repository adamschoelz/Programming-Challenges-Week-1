import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

class Self{

	public static void main(String args[]){
		Self self = new Self();
		boolean[] selfNums = self.notSelfNumsList(Integer.parseInt(args[0]));
		for(int i = 0; i < selfNums.length; i++){
			if(selfNums[i] == false){
				System.out.println(i);
			}
		}
	}

	boolean[] notSelfNumsList(int max){
		boolean[] selfNums = new boolean[max];
		selfNums[0] = true;
		int counter = 1;
		int generated = generate(counter);
	
		for(int i = 0; i < max; i++){
			generated = generate(i);
			if(generated < max){
				selfNums[generated] = true;
			}
		}
		return selfNums;
	}

	int generate(int num){
		int generated = num;
		char[] digits = Integer.toString(num).toCharArray();
		for(int i = 0; i < digits.length; i++){
			generated += Character.getNumericValue(digits[i]);
		}

		return generated;
	}
}