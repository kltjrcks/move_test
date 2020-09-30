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
			String input1 = br.readLine();
			String array1[] = input1.split(" ");
			
			
			String input2 = br.readLine();
			
			String array2[] = input2.split(" ");
			
			int min = Integer.parseInt(array2[0]);
			int max = Integer.parseInt(array2[0]);
			
			for(int i=0;i < Integer.parseInt(array1[0]);i++)
			{
				if(Integer.parseInt(array2[i]) < min)
				{
					min = Integer.parseInt(array2[i]);
				}
				if(Integer.parseInt(array2[i]) > max)
				{
					max = Integer.parseInt(array2[i]);
				}
			}
			System.out.print(min);
			System.out.print(" ");
			System.out.print(max);
			
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

