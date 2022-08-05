package InsertionSort;

public class SortInsertion {

	public static void main(String[] args) {
		int[] arr = {5,3,4,1,2};

		for(int i = 1 ; i < 5 ; i++) {
			int j = i - 1;
			int temp = arr[i];
			while (j >= 0 && temp < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}

		for (int each : arr) {
			System.out.print(each + " ");
		}

		
	}

	
}
