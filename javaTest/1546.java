

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
		String array[];
		double max = 0;
		double avg = 0;
		try 
		{
			int roop = Integer.parseInt(br.readLine());
			
			input = br.readLine();
			
			array = input.split(" ");
			
			for(int i=0;i<roop;i++)
			{
				if (max < Double.parseDouble(array[i]))
				{
					max = Double.parseDouble(array[i]);
				}
			}
			
			for(int x=0;x<array.length;x++)
			{
				avg += (Double.parseDouble(array[x]) * 100 / max) ;
				
			}
			
			
			avg = avg / array.length;
			
			System.out.println(avg);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}



