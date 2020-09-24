import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			int sum = 0;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String input = br.readLine();
			
			String array[] = input.split(" ");
			
			
			for (int i=0; i < array.length; i++){
				sum += Integer.parseInt(array[i]);
				
			}
			System.out.println(sum);
			
		}
		catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}

