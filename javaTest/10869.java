
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String input = br.readLine();
			
			String array[] = input.split(" ");
			
			int plus = Integer.parseInt(array[0]) + Integer.parseInt(array[1]);
			int min = Integer.parseInt(array[0]) - Integer.parseInt(array[1]);
			int mul = Integer.parseInt(array[0]) * Integer.parseInt(array[1]);
			int div = Integer.parseInt(array[0]) / Integer.parseInt(array[1]);
			int remains = Integer.parseInt(array[0]) % Integer.parseInt(array[1]);
			
			System.out.println(plus);
			System.out.println(min);
			System.out.println(mul);
			System.out.println(div);
			System.out.println(remains);
			
		}
		catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}

 