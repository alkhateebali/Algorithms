# Linear Search Algorithm

## Overview

- Linear Search, also known as Sequential Search, is a straightforward algorithm for finding the position of a target
  element in an array.
- It iterates through each element in the array until it finds the target or reaches the end.

## Algorithm Steps

1. **Start at the Beginning:** Begin searching from the first element of the array.
2. **Iterate Through Array:** Move through each element one by one until the target element is found or the end of the
   array is reached.
3. **Target Found:** If the target element is found, return its index.
4. **Target Not Found:** If the entire array is searched, return a special value (e.g., -1) to indicate that the target
   is not present.

## Key Characteristics

- Time Complexity: O(n), where n is the number of elements in the array.
- Simple and easy to understand.
- Suitable for small datasets.

## Advantages and Disadvantages

### Advantages

- Straightforward implementation.
- Works well for small datasets.

### Disadvantages

- Inefficient for large datasets compared to more advanced search algorithms.
- Iterates through the entire array, even if the target is found early.

## Use Cases

- Suitable for small datasets or scenarios where the dataset is not sorted.
- Commonly used when a simple search algorithm is sufficient.

## Example

Consider an array: `[5, 3, 9, 2, 7]` and a target element `2`.

1. Start at the beginning.
2. Iterate through the array: `5` (no match), `3` (no match), `9` (no match), `2` (match found at index 3).
3. Return the index `3` as the result.

## Conclusion

Linear Search is a simple algorithm that sequentially searches through each element in the array until it finds the
target or reaches the end.

# Binary Search Algorithm

## Overview

- Binary Search is an efficient algorithm for finding a target element in a sorted array.
- It works by repeatedly dividing the search interval in half.
- The target element is compared with the middle element of the array, narrowing down the search range.

## Algorithm Steps

1. **Sort the Array:** Binary Search requires a sorted array as input.
2. **Initialize Search Interval:** Set the search interval as the entire array.
3. **Find the Middle:** Compute the middle index of the search interval.
4. **Compare and Narrow Down:** Compare the target element with the middle element.
    - If equal, return the middle index as the result.
    - If less, search in the left half of the array.
    - If greater, search in the right half of the array.
5. **Repeat:** Repeat steps 3-4 until the target is found or the search interval becomes empty.

## Key Characteristics

- Time Complexity: O(log n), where n is the number of elements in the array.
- Requires a sorted array as input.
- Efficient for large datasets.

## Advantages and Disadvantages

### Advantages

- Significantly faster than Linear Search for large datasets.
- Logarithmic time complexity.

### Disadvantages

- Requires a sorted array as input.
- Additional space is not minimized.

## Use Cases

- Efficient for searching in large sorted datasets.
- Well-suited for scenarios where the dataset is static or changes infrequently.

## Example

Consider a sorted array: `[2, 4, 6, 8, 10]` and a target element `6`.

1. Start with the entire array as the search interval.
2. Find the middle: `6` (equal to the target).
3. Return the index of `6` as the result.

## Conclusion

Binary Search efficiently finds a target element in a sorted array by repeatedly dividing the search interval in half.



