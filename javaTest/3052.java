

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
		
		int num = 0;
		int array[] = new int[42];
		int count = 0;
		try 
		{
			
			for(int i=0;i<10;i++)
			{
				num = Integer.parseInt(br.readLine()) % 42;
				array[num] ++;
				
			}
			
			for(int x=0;x<array.length;x++)
			{
				if(array[x]!=0)
				{
					count++;
				}
				
			}
			System.out.println(count);
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


 
