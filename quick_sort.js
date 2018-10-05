function swap(items, firstIndex, secondIndex){
    var temp = items[firstIndex];
    items[firstIndex] = items[secondIndex];
    items[secondIndex] = temp;
}

function partition(items, left, right) {
    
    var pivot   = items[Math.floor((right + left) / 2)], //take the pivot around the middle of the array (could be ceiling function too)
        i       = left,
        j       = right;
    
    while (i <= j) {

        while (items[i] < pivot) {
            i++;
        }

        while (items[j] > pivot) {
            j--;
        }

        if (i <= j) {
            swap(items, i, j);
            i++;
            j--;
        }
    }
    
    return i;
}

function quickSort(items, left, right) {
    
    var index;

    //if the function is called with an empty array or a single-element array, we don't do anything
    if (items.length > 1) {

        left = typeof left != "number" ? 0 : left; //if the left pointer is not set we set it to the first element of the array
        right = typeof right != "number" ? items.length - 1 : right; //if the right pointer is not set we select the last element of the array

        index = partition(items, left, right); //partition the array given left and right. index will be where the left pointer ended up after the partition

        if (left < index - 1) {
            quickSort(items, left, index - 1); //quicksort the left side of the partition
        }

        if (index < right) {
            quickSort(items, index, right); //quicksort the right side of the partition
        }

    }

    return items;
}

// USAGE
//var result = quickSort(items);