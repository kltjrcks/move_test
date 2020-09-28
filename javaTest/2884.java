

import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = Integer.parseInt(sc.next());
		
		int M = Integer.parseInt(sc.next());
		
		
		if(M-45 < 0){
			int num = M-45+60;
			if(H-1 < 0){
				System.out.print(23);
				System.out.print(' ');
				System.out.println(num);
			}
			else{
				
				System.out.print(H-1);
				System.out.print(' ');
				System.out.println(num);
			}
		}
		else{
			System.out.print(H);
			System.out.print(' ');
			System.out.println(M-45);
		}
	}

}
 