
import java.util.*;

public class Euclidean {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두개의 숫자 입력. 첫번째 숫자가 더 커야 합니다.");
		
		System.out.println("첫번째 숫자");
		int a = scan.nextInt();
		System.out.println("두번째 숫자");
		int b = scan.nextInt();
		int r = 0;
		
		do {
			r = a % b;
			a = b;
			b = r;
		} while (r!=0);
		System.out.println("최대 공약수는 " + a + "입니다.");
		
	}
	
}
