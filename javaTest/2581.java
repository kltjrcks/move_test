
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
			
			int min = input2;
			int sum = 0;
			
			for(int i=input1; i<=input2; i++)
			{
				if(i == 1)
				{
					continue;
				}
				else
				{
					for(int x=2; x<=i; x++)
					{
						if(i % x ==0)
						{
							if(i != x)
							{
								break;
							}
							else
							{
								sum = sum + i;
								if(min > i)
								{
									min = i;
								}
							}
						}
					}
				}
			}
			if(sum == 0)
			{
				System.out.println(-1);
			}
			else
			{
				System.out.println(sum);
				System.out.println(min);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


