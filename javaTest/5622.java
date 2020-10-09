
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {	
		
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int alphabet[] = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		int number = 0;
		try 
		{
			String input = br.readLine();
			
			for(int i=0; i<input.length(); i++)
			{
				number += (alphabet[input.charAt(i) - 'A'] + 1);
			}
			
			System.out.println(number);
			
		}

		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


