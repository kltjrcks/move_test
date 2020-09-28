import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {	
	
	static String[] input(){
		try{
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			
			String input1 = br1.readLine();
			
			String array1[] = input1.split(" ");
			
			return array1;
			
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		
		String array1[] = input(); 
		
		int num1 = Integer.parseInt(array1[0]);
		
		if( (num1 % 4 == 0) && ((num1 % 100 != 0) || (num1 % 400 == 0)) ){
			System.out.println("1");
		}
		else{
			System.out.println("0");
		}
	}

}
