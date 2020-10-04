

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
		
		
		try 
		{
			int num1 = Integer.parseInt(br.readLine());
			int num2 = Integer.parseInt(br.readLine());
			int num3 = Integer.parseInt(br.readLine());
				
			int total = num1 * num2 * num3;
			
			String number = Integer.toString(total);
			int N0 = 0;
			int N1 = 0;
			int N2 = 0;
			int N3 = 0;
			int N4 = 0;
			int N5 = 0;
			int N6 = 0;
			int N7 = 0;
			int N8 = 0;
			int N9 = 0;
			
			for(int i=0; i < number.length(); i++)
			{
				String sub = number.substring(i,i+1);
				
				
				switch(sub)
				{
				case "0": N0++; break;
				
				case "1": N1++; break;
				case "2": N2++; break;
				case "3": N3++; break;
				case "4": N4++; break;
				case "5": N5++; break;
				case "6": N6++; break;
				case "7": N7++; break;
				case "8": N8++; break;
				case "9": N9++; break;
				}
				
			}
			
			System.out.println(N0);
			System.out.println(N1);
			System.out.println(N2);
			System.out.println(N3);
			System.out.println(N4);
			System.out.println(N5);
			System.out.println(N6);
			System.out.println(N7);
			System.out.println(N8);
			System.out.println(N9);
			
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

 
