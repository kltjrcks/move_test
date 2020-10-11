
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
			
			String input = "";
			int status = roop;
			
			
			for(int i=0; i<roop; i++)
			{
				int confirm[] = new int[26];
				int alphabet = -1;
				int noGroup = 0;
				input = br.readLine();
			
				for(int x=0; x<input.length(); x++)
				{
					char num = input.charAt(x);
					
					if(x!=0)					
					{
						if(alphabet == (num -'a'))
						{
							continue;
						}
						else
						{
							if(confirm[num-'a'] == 0)
							{
								confirm[num -'a']++;
							}
							else
							{
								noGroup++;
							}
						}
					}
					else
					{
						confirm[num -'a']++;
					}
					alphabet = (num -'a');	
				}
				if(noGroup!=0)
				{
					status--;
				}
			}
			System.out.println(status);
		}

		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}



