
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String input = br.readLine();
			
			String array[] = input.split(" ");
			
			double di = Double.parseDouble(array[0]) / Double.parseDouble(array[1]);
			System.out.println(di);
			
		}
		catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}
 

