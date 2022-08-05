package SelectionSort;

public class SortSelection {

	public static void main(String[] args) {
			
			
			int[] arr = {12, 13, 11, 14, 10}; //정렬값 배열
			
			System.out.print("정렬 전 ");
			
//			for each 구문 만드는 법
//			for (자료형 + 해야 할일: 배열) {
//			    출력
//			}
//			아래의 경우는 하나씩 출력 해야 해서 자료형 int each로 받음
			
			
			
			for (int each : arr) {
				System.out.print(each + " "); //배열 출력
			}
			System.out.println();
			System.out.println();
			
			
			
			for (int i=0; i<4; i++) {
				int min = i;	//첫번째 값을 임시 최소값으로 지정	
				
				for (int k = i+1; k<5; k++) {
					//최소값 찾기 처리
					if (arr[k] < arr[min]) {
					min = k;
					
					}
				}
				//최소값 변경이 필요한 경우 교환 처리
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
				
				for (int each : arr) {
					System.out.print(each + " ");
				}
				System.out.println(); //중간 값 출
				
			}
			System.out.println();
			System.out.print("정렬 후 ");
			 for (int j=0; j<arr.length; j++) {
				 System.out.print(arr[j] + " ");
			 }
			 
		}
		
	}
	

