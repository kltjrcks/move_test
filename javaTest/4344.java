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
			int count = Integer.parseInt(br.readLine());
			for(int c=0; c < count; c++)
			{
				int total = 0;
				double top = 0;
				
				String array[] = br.readLine().split(" ");
			
				for(int i=1; i < Integer.parseInt(array[0])+1;i++)
				{
					total += Integer.parseInt(array[i]);
				}
				
				double avg = total / (array.length - 1);
				
				for(int i=1; i < Integer.parseInt(array[0])+1;i++)
				{
					if(Integer.parseInt(array[i]) > avg)
					{
						top++;
					}
				}
				
				double rate = top / (array.length -1) * 100;
				
				System.out.println(String.format("%.3f", rate) + "%");
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

