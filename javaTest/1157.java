
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {	
		
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			String input = (br.readLine()).toUpperCase();
			int array[] = new int[26] ;
			
			for(int i=0; i< input.length(); i++)
			{
				array[input.charAt(i) - 'A']++;
			}
			
			int max = 0;
			int maxCount = 0;
			int maxIndex = 0;
			
			for(int x=0; x<array.length; x++)
			{
				if(max < array[x])
				{
					max = array[x];
				}
			}
			for(int x1=0; x1<array.length;x1++)
			{
				if(max == array[x1])
				{
					maxCount++;
				}
			}
			
			if(maxCount > 1)
			{
				System.out.println("?");
			}
			else
			{
				for(int x2=0; x2<array.length; x2++)
				{
					if(array[x2] == max)
					{
						int al = x2 + 'A';
						System.out.println((char)al);
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


