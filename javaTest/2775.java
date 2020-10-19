
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {	
	
	public static int sum_val(int[] array, int a)
	{
		int sum = 0;
		for(int i=0; i<a+1; i++)
		{
			sum = sum + array[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			int loop = Integer.parseInt(br.readLine());
			
			for(int i=0; i<loop; i++)
			{
				int k = Integer.parseInt(br.readLine());
				int n = Integer.parseInt(br.readLine());
				
				int num = 1;
				
				int arrayN[] = new int[n];
				
				for(int x=0; x<n; x++)
				{
					arrayN[x] = num;
					num++;
				}
				
				int arrayG[] = new int[n];
				
				for(int x1=0; x1<k; x1++)
				{
					for(int x2=0; x2<n; x2++)
					{
						arrayG[x2] = sum_val(arrayN, x2);
					}
					arrayN = arrayG.clone();
					
				}
				
				System.out.println(arrayN[arrayN.length-1]);
				
			}		
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


