
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {	
	
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			int loop = Integer.parseInt(br.readLine());
			
			for(int i=0; i<loop; i++)
			{
				String input = br.readLine();
				String array[] = input.split(",");
				
				System.out.println(Integer.parseInt(array[0]) + Integer.parseInt(array[1])); 
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


