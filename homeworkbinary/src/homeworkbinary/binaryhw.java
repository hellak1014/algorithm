package homeworkbinary;

public class binaryhw {

	public static void main(String[] args) {
						
				int [] arr = {8, 11, 15, 23, 28, 33, 37, 45};
				
				int head = 0;
				int tail = 7;
				int x = 37;
				
				
				
				while (head <= tail) {
					int center = (head+tail) / 2;
					if (arr[center]==x) {
						System.out.println("찾는 값이 " + center +"번째에 있습니다.");
						break;
					} else if (arr[center]>x) {
						tail = center-1;
					} else { 
						head = center+1;
					}
				} 

				if (head >= tail) {
				
					System.out.println("찾는 값이 없습니다.");
				
			}
				
				
			}
		
	}
	

