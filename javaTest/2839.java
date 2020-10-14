
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {	
		
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			int input = Integer.parseInt(br.readLine());
			int value;
			int count;
			int MIN = -1;
			
			for(int x=0;;x++)
			{
				if(5*x > input)
				{
					break;
				}
				for(int y=0;;y++)
				{
					value = 5*x + 3*y;
					if(value > input)
					{
						break;
					}
					else
					{
						if(value == input)
						{	
							count = x+y;
							
							if(MIN == -1)
							{
								MIN = count;
							}
							if(MIN > count)
							{
								MIN = count;
							}
						}
					}
				}
			}
			System.out.println(MIN);
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


