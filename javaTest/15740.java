
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {	
	
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			
			String input = br.readLine();
			String array[] = input.split(" ");
			
			BigInteger biA = new BigInteger(array[0]);
			BigInteger biB = new BigInteger(array[1]);
			
			BigInteger a = biA.add(biB);
			
			System.out.println(a);
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


