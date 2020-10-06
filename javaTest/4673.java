
public class Main {	
	
	static int dn(String a)
	{
		int con= Integer.parseInt(a);
		
		for(int i=0; i<a.length();i++)
		{
			con += Integer.parseInt(a.substring(i,i+1));
			
		}
		
		return con;
	}
	
	
	
	public static void main(String[] args) 
	{
		int conNum = 0;
		
		int array[] = new int[10001];
			
		for(int i=1; i<= 10000;i++)
		{
			conNum = dn(Integer.toString(i));
			if(conNum <= 10000)
			{
				array[conNum] = 1;
			}	
		}
			
		for(int x=1; x<array.length; x++)
		{
			if(array[x] != 1)
			{
				System.out.println(x);
			}
		}
	}
}


