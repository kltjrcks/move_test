
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String input = br.readLine();
			
			String array[] = input.split(" ");
			
			int mul = Integer.parseInt(array[0]) * Integer.parseInt(array[1]);
			
			System.out.println(mul);
			
		}
		catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}

 