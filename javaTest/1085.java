
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {	

	public static void minY(int y, int h){
		System.out.println(Math.abs(h-y));
	}
	
	public static void minX(int x, int w){
		System.out.println(Math.abs(w-x));
	}
	
	
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			
			String input = br.readLine();
			String array[] = input.split(" ");
			
			int x = Integer.parseInt(array[0]);
			int y = Integer.parseInt(array[1]);
			int w = Integer.parseInt(array[2]);
			int h = Integer.parseInt(array[3]);
			
			
			if(x > w/2)
			{   
				if(y> h/2)
				{
					if(w-x < h-y)
					{
						minX(x,w);
					}
					else
					{
						minY(y,h);
					}
				}
				
				else
				{
					if(w-x < y)
					{
						minX(x,w);
					}
					else
					{
						minY(y,0);
					}
				}
			}
			else
			{   
				if(y> h/2)
				{   
					if(x < h-y)
					{
						minX(x,0);
					}
					else
					{
						minY(y,h);
					}
				}
				
				else
				{
					if(x < y)
					{
						minX(x,0);
					}
					else
					{
						minY(y,0);
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


