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
		int count;
		
		try 
		{
			count = Integer.parseInt(br.readLine());
		
			for(int i=0; i < count; i++)
			{
				for(int y=1; y < count-i;y++)
				{
					bw.write(" ");		
				}
				
				for(int x=0; x < i; x++)
				{
					bw.write("*");
				}
				
				bw.write("*\n");
			}
			bw.flush();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
