

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {	
	
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = "";
		String array[] = null;
		
		try 
		{
			int roop = Integer.parseInt(br.readLine());
			int zeroCount = 0;
			
			for(int i=0;i<roop;i++)
			{
				zeroCount = 0;
				input = br.readLine();
				array = input.split("X");

				for(int x=0;x<array.length;x++)
				{
				 
					for(int c=1;c<array[x].length()+1;c++)
					{
						zeroCount += c;
					}
				}
				System.out.println(zeroCount);
			}
			
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}



