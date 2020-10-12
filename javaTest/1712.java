
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
			int C = Integer.parseInt(array[2]);
			
			int x = 0;
			
			if(B >= C)
			{
				System.out.println(-1);
			}
			else
			{
				System.out.println(A/(C-B)+1);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


