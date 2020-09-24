import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String input = br.readLine();
			
			String array[] = input.split(" ");
			
			int A = Integer.parseInt(array[0]);
			int B = Integer.parseInt(array[1]);
			int C = Integer.parseInt(array[2]);

			System.out.println((A+B)%C);
			System.out.println(((A%C)+(B%C))%C);
			System.out.println((A*B)%C);
			System.out.println(((A%C)*(B%C))%C);
			
		}
		catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}


