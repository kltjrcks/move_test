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
				
			long x = Integer.parseInt(array[0]);
			long y = Integer.parseInt(array[1]);
			
			
			long c = ((100*y) / x);
			
			if(c>=99)
			{
				System.out.println(-1);
			}
			else
			{
				long min = 0;
				long max = (long) Math.pow(10, 12);
				for(;;)
				{
					long mid = (max + min) / 2;
					long Z = (long)((100*(y+mid)) / (x+mid));
					
					if(Z <= c)
					{
						
						min = mid + 1;
						
					}
					else
					{
						max = mid - 1;
					}
					
					if(min > max)
					{
						System.out.println(min);
						break;
					}
				}
			}
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


