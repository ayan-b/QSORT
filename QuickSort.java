
/**
 * @author ksklee
 * QuickSort Class, a implementation of QuickSort
 */
public class QuickSort {
	int partition(int arr[], int low, int high){
		int pointer = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++){
			if (arr[j] <= pointer){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
			
		return i+1;
	}

	void sort(int arr[], int low, int high){
		if (low < high){
			int pi = partition(arr, low, high);
		
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}

	static void printArray(int arr[]){
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {90, 57, 68, 89, 11, 35};
		int n = arr.length;
		
		System.out.println("Before:");
		printArray(arr);
		
		QuickSort quicksort = new QuickSort();
		quicksort.sort(arr,  0, n-1);
		
		System.out.println("After:");
		printArray(arr);
	}
	

}

