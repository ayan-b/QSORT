/**Comments by SpaceDigi
 * Please refactor this code
 * Please change view for your codestyle
 * Please change your codestyle(for ksklee)
 * This code aren't working, it's can't be compiling
 * You have two name of classes and there are equals. So, it's must not be in one file or one directory
 * Please read again java naming classes, packaging, etc.
 * With love, by SpaceDigi
 */

class QuickSort {
    
    int partition(int arr[], int low, int high) {
        int pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++) {

            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
 
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
   public void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    // Driver program
    public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
 
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);
 
        System.out.println("sorted array");
        printArray(arr);
    }
}

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

