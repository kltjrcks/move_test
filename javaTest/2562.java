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
			int count = 0;
			int max = 0;
			
			for(int i=0; i<9; i++)
			{
				int input = Integer.parseInt(br.readLine());
				if(max < input)
				{
					max = input;
					count = i+1;
				}
			}
			System.out.println(max);
			System.out.println(count);
				
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

