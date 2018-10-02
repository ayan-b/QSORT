public class QuickSort
{   
    // QUICK_SORT 
	public static void quickSort(int[] input) {
		qs(input,0,input.length-1);
	}
	public static void qs(int []a,int si,int ei){
		if(si>=ei)
			return;
		int c=partition(a,si,ei);
		qs(a,si,c-1);
		qs(a,c+1,ei);
	}

	// PARTITION
	public static int partition(int[]a,int si,int ei){
		int x=a[si],count=0;
		for(int i=si+1;i<=ei;i++){
			if(a[i]<x)
				count++;
		}
		int temp=a[si+count];
		a[si+count]=x;
		a[si]=temp;
		int i=si,j=ei;
		while(i<si+count && j>si+count){
			if(a[i]<x && a[j]>=x)
			{
				i++;
				j--;
			}
			else if(a[i]<x && a[j]<x)
				i++;
			else if(a[i]>=x && a[j]>=x)
				j--;
			else
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}  
		}
		return si+count;
	}
	public static void main(String[] args) {
		int arr[]={5,34,78,4,2};
		quickSort(arr);   // array 'arr' will be sorted
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}//CLASS
