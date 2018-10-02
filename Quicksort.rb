def quicksort(arr, lo, hi)
  
  if arr.length <= 1
    return arr
  else
    pivot = segment(arr, lo, hi)
    if (lo < pivot-1)
      quicksort(arr, lo, pivot-1)
    end
    if (hi > pivot)
      quicksort(arr, pivot, hi)
    end
    return arr
  end
  
end

def segment(arr, lo, hi)
  pivot = arr[hi]

  left = lo
  for element in (lo...hi)
    if arr[element] <= pivot
      arr[left], arr[element] = arr[element], arr[left]
      left += 1
    end
  end
  
  arr[left], arr[hi] = arr[hi], arr[left]
  return left
  
end
