
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {	
		
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			String input = br.readLine();
			
			String array[] = input.split(" ");

			int A1 = Integer.parseInt(array[0]) / 100;
			
			int A2 = (Integer.parseInt(array[0]) % 100) / 10;
			
			int A3 = (Integer.parseInt(array[0]) % 100) % 10;
			
			int B1 = Integer.parseInt(array[1]) / 100;
			
			int B2 = (Integer.parseInt(array[1]) % 100) / 10;
			
			int B3 = (Integer.parseInt(array[1]) % 100) % 10;
		
			int A = A3*100 + A2*10 + A1;
			int B = B3*100 + B2*10 + B1;
			
			if(A<B)
			{
				System.out.println(B);
			}
			else
			{
				System.out.println(A);
			}
			
		}

		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
