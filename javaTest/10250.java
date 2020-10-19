
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
				String array[] = input.split(" ");
				
				int count = 0;
				
				for(int W=1; W<Integer.parseInt(array[1])+1; W++)
				{
					for(int H=1; H<Integer.parseInt(array[0])+1; H++)
					{
						count++;
						
						if(count == Integer.parseInt(array[2]))
						{
							
							if(W < 10)
							{
								System.out.println(Integer.toString(H)+"0"+Integer.toString(W));
							}
							else
							{
								System.out.println(Integer.toString(H)+Integer.toString(W));
							}
							break;
						}
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


