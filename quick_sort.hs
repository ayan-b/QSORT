module QSORT where

{-
   Usage Notes:
   $ ghci quick_sort.hs
   *QSORT> quicksort [6,4,1,3,8,6,2,7,7,1337]
-}

quicksort :: [Int] -> [Int]
quicksort [] = []
quicksort (x:xs) = smaller ++ equal ++ greater
    where smaller = quicksort $ (filter (<x) xs)
          equal = filter (==x) (x:xs)
          greater = quicksort $ (filter (>x) xs)
