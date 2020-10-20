import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {	
	
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			int input1 = Integer.parseInt(br.readLine());
			int input2 = Integer.parseInt(br.readLine());
			
			System.out.println(input1 + input2);
			
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}