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
		
			for(int i=1; i<count+1; i++)
			{
				for(int y=0;y<i;y++)
				{
					bw.write("*");		
				}
				bw.write("\n");
			}
			bw.flush();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

