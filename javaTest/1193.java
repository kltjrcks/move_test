
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {	
		
	public static int[] move(int input, int x, int y, int mode)
	{
		int count = 2;
		while(count <= input)
		{
			if(mode == 1)
			{
				if(y ==1)
				{
					x = x+1;
					mode = 0; 
				}
				else
				{
					x = x+1;
					y = y-1;
				}
			}
			else if(mode == 0)
			{
				if(x==1)
				{
					y = y+1;
					mode = 1;
				}	
				else
				{
					x = x-1;
					y = y+1;
				}
			}
			count++;
		}
		int array[] = {x,y};
		
		return array;
	}
	
	
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			int input = Integer.parseInt(br.readLine());
			
			int mode = 0;
			int x = 1;
			int y = 1;
			
			if(input == 1){
				System.out.println(x+"/"+y);
			}
			else{
				int array[] = move(input,x,y,mode);
				System.out.print(array[0]+"/"+array[1]);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


