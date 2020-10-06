
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {	
		
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			int total = 0;
			int roop = Integer.parseInt(br.readLine());
			String tieNum = br.readLine();
			
			for(int i=0;i<roop;i++)
			{	
				total += Integer.parseInt(tieNum.substring(i,i+1));
				
			}
			System.out.println(total);
			
		}
		
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


