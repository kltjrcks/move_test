import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		int count = Integer.parseInt(sc1.nextLine());
		
		int sum = 0;
		for(int i=1; i <= count; i++){
		
			sum += i;
		}
		
		System.out.println(sum);
		
	}
}
