
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
			char ASC= input.charAt(0);
			
			System.out.println((int)ASC);
			
		}
		
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


