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
		
		if( 90 <= num1 && num1 <= 100){
			System.out.println("A");
		}
		else if( 80 <= num1 ){
			System.out.println("B");
		}
		else if( 70 <= num1 ){
			System.out.println("C");
		}
		else if(60 <= num1) {
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
	}

}
