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
				String input= br.readLine();
				
				String array[] = input.split(" ");
				
				int num1 = Integer.parseInt(array[0]);
				int num2 = Integer.parseInt(array[1]);
				
				int sum = num1 + num2;
				
				bw.write("Case #"+i+": "+num1+" + "+num2+" = "+sum+"\n");
			}
			bw.flush();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

