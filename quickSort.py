def quickSort(low, high, arr):
	if(low<high): #Terminating Condition
		pivot = partition(low, high, arr) #Extracting pivot location
		quickSort(low, pivot-1, arr)
		quickSort(pivot+1, high, arr)

def partition(low, high, arr):
	pivot = arr[high]
	pivot_index=low-1

	for i in range(low, high):
		if(arr[i]<=pivot): #Extracting elements smaller than the the pivot
			pivot_index+=1
			arr[pivot_index], arr[i]= arr[i], arr[pivot_index] #Swapping smaller element with the element at pivot_index

	pivot_index+=1
	arr[pivot_index], arr[high]= arr[high], arr[pivot_index] #Final swapping to bring the pivot in place
	return (pivot_index)

if __name__ == "__main__":
	arr=raw_input("Enter the array to be sorted:: ").split() #Splitting the input on spaces
	arr=[int(a) for a in arr]
	quickSort(0, len(arr)-1, arr) #Start index: 0; End index: length -1;
	print(arr)