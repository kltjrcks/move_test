
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {	
		
	public static void beeRecursion(int base, int round, int input)
	{
		int round_max;
		
		round_max = base + 6 * round;
		
		if(input <= round_max)
		{
			System.out.println(round+1);
		}
		else
		{
			round++;
			beeRecursion(round_max, round, input);
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			int input = Integer.parseInt(br.readLine());
			
			int base = 1;
			int round = 0;
			
			beeRecursion(base, round, input);
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


