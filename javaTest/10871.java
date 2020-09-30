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
			String input = br.readLine();
			
			String array[] = input.split(" ");
		
			int count = Integer.parseInt(array[0]);
			int number = Integer.parseInt(array[1]);
			
			String input1 = br.readLine();
			
			String array1[] = input1.split(" ");
			
			
			for(int i=0; i < count; i++)
			{
				int compare = Integer.parseInt(array1[i]);
				
				if(number > compare) 
				{
					bw.write(compare+" ");
				}
			}
			bw.flush();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
