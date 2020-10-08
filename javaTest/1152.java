
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
			String tr_input = input.trim();
			String array[] = tr_input.split(" ");
			
			if(tr_input.isEmpty())
			{
				System.out.print(0);
			}
			else{
				System.out.print(array.length);
			}
			
		}

		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


