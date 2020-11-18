
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import static java.lang.Math.sqrt;

public class Main {	
	
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			int count = Integer.parseInt(br.readLine());
			
			String input = br.readLine();
			String array[] = input.split(" ");
			int primeNumber = 0;
			
			for(int i=0; i<array.length; i++)
			{
				if(Integer.parseInt(array[i]) == 1)
				{
					continue;
				}
				else
				{
					int num = Integer.parseInt(array[i]);
					for(int x=2; x<=Math.sqrt(num); x++)
					{
						if(num % x ==0)
						{
							if(num != x)
							{
								break;
							}
							else
							{
								primeNumber++;
							}
						}
					}
				}
			}
			System.out.println(primeNumber);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


