
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {	
		
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			int roop = Integer.parseInt(br.readLine());
			for(int i=0; i<roop; i++)
			{
				String input = br.readLine();
				
				String array[] = input.split(" ");
				
				for(int x1=0; x1<array[1].length(); x1++)
				{
					for(int x=0; x<Integer.parseInt(array[0]); x++)
					{	
						System.out.print(array[1].charAt(x1));
						
					}
				}
				System.out.println();
			}
			
			
			
		}

		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


