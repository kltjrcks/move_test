import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static int pow(int number, int count){
		int pow = 1;
		
		if(count == 0){
			return 1;
		}
		
		while(true){
			pow = pow * number;
			
			if (count == 1){
				return pow;
			}
			count --;
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			
			String input1 = br1.readLine();
			String input2 = br1.readLine();
			
			String array1[] = input1.split(" ");
			String array2[] = input2.split(" ");
			
			int num1 = Integer.parseInt(array1[0]);
			
			String num2 = array2[0];
			
			int parse = 0;
			int pow = 0;
			
			for (int i = num2.length(); i > 0; i--){
				
				parse += num1 * (Integer.parseInt(num2.substring(i-1,i)) * (pow(10,pow)));
				
				System.out.println(num1 * Integer.parseInt(num2.substring(i-1,i)));
				
				pow++;
			}
			System.out.println(parse);
		}
		catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}
 