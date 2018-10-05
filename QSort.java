public class QuickSort {
    public static void main(String args[]) {
        int a[] = {5, 7, 4, 3, 6, 8, 9, 1, 2, 0};
        QuickSort obj = new QuickSort();
        for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
        System.out.println();
        obj.quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
        System.out.println();
    }

    void quickSort(int array[], int start, int end) {
        int i = start;
        int k = end;
        if (end - start >= 1) {
            int pivot = array[start];
            while (k > i) {
                while (array[i] <= pivot && i <= end && k > i) i++;
                while (array[k] > pivot && k >= start && k >= i) k--;
                if (k > i) swap(array, i, k);
            }
            swap(array, start, k);
            quickSort(array, start, k - 1); // quicksort the left partition
            quickSort(array, k + 1, end);   // quicksort the right partition
        }
    }//quickSort()

    void swap(int array[], int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }//swap()
}//class