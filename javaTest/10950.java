import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		int count = Integer.parseInt(sc1.nextLine());
		
		for(int i=0; i < count; i++){
			
			int num1 = Integer.parseInt(sc1.next());
			int num2 = Integer.parseInt(sc1.next());
			
			System.out.println(num1+num2);
		}
	}
}
