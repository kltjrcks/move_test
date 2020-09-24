import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String input = br.readLine();
			
			String array[] = input.split(" ");
			
			int min = Integer.parseInt(array[0]) - Integer.parseInt(array[1]);
			
			System.out.println(min);
			
		}
		catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}
