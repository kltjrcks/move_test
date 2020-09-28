
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
		
		int numA = Integer.parseInt(array1[0]);
		int numB = Integer.parseInt(array1[1]);
		
		if(numA == numB){
			System.out.println("==");
		}
		else if(numA > numB){
			System.out.println(">");
		}
		else{
			System.out.println("<");
		}
	}
}
 
