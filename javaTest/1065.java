
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {	
	
	static int dn(String a)
	{
		int gapArray[] = new int[3];
		int count = 0;
		int min = 0;
		for(int x=0;x<a.length();x++)
		{
			gapArray[x] = Integer.parseInt(a.substring(x,x+1));		
		}
		
		min = gapArray[0] - gapArray[1];
		
		for(int i=0; i<gapArray.length-1;i++)
		{
			if(min != (gapArray[i] - gapArray[i+1]))
			{
				count = 0;
				return count;
			}
		}
			
		count ++;
		return count;
	}
	
	
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int total = 0;
		
		try 
		{
			String roop = br.readLine();
			
			for(int i=1; i<Integer.parseInt(roop)+1;i++)
			{
				if(i == 1000)
				{
					continue;
				}
				else if(i >= 100)
				{
					total += dn(Integer.toString(i));
				}
				else if(0 < i)
				{
					total++;
				}
					
			}
			System.out.println(total);
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


