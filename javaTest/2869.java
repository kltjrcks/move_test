

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
			
			int A = Integer.parseInt(array[0]);
			int B = Integer.parseInt(array[1]);
			int V= Integer.parseInt(array[2]);
			
			double x = Math.ceil((double)(V-B) / (double)(A-B));
			
			
			System.out.println((int)x);
			
			
			
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


