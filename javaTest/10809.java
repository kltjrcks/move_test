
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {	
		
	public static void main(String[] args) 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int array[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		
		try 
		{
			String input = br.readLine();
			for(int i=0; i<input.length(); i++)
			{
				char alpa = input.charAt(i);
				
				switch(alpa)
				{
				
				case('a'): if(array[0] == -1)array[0] = i;
				continue;
				case('b'): if(array[1] == -1)array[1] = i;
				continue;
				case('c'): if(array[2] == -1)array[2] = i;
				continue;
				case('d'): if(array[3] == -1)array[3] = i;
				continue;
				case('e'): if(array[4] == -1)array[4] = i;
				continue;
				case('f'): if(array[5] == -1)array[5] = i;
				continue;
				case('g'): if(array[6] == -1)array[6] = i;
				continue;
				case('h'): if(array[7] == -1)array[7] = i;
				continue;
				case('i'): if(array[8] == -1)array[8] = i;
				continue;
				case('j'): if(array[9] == -1)array[9] = i;
				continue;
				case('k'): if(array[10] == -1)array[10] = i;
				continue;
				case('l'): if(array[11] == -1)array[11] = i;
				continue;
				case('m'): if(array[12] == -1)array[12] = i;
				continue;
				case('n'): if(array[13] == -1)array[13] = i;
				continue;
				case('o'): if(array[14] == -1)array[14] = i;
				continue;
				case('p'): if(array[15] == -1)array[15] = i;
				continue;
				case('q'): if(array[16] == -1)array[16] = i;
				continue;
				case('r'): if(array[17] == -1)array[17] = i;
				continue;
				case('s'): if(array[18] == -1)array[18] = i;
				continue;
				case('t'): if(array[19] == -1)array[19] = i;
				continue;
				case('u'): if(array[20] == -1)array[20] = i;
				continue;
				case('v'): if(array[21] == -1)array[21] = i;
				continue;
				case('w'): if(array[22] == -1)array[22] = i;
				continue;
				case('x'): if(array[23] == -1)array[23] = i;
				continue;
				case('y'): if(array[24] == -1)array[24] = i;
				continue;
				case('z'): if(array[25] == -1)array[25] = i;
				continue;
				}
			}
			for(int x=0; x<array.length; x++)
			{
				System.out.print(array[x]);
				System.out.print(" ");
			}
			
		}

		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


