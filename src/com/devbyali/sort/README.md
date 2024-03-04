# Bubble Sort Algorithm

### Overview

- Bubble Sort is a simple comparison-based sorting algorithm.
- It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
- The pass through the list is repeated until the entire list is sorted.

### Algorithm Steps

1. Start with the entire list as unsorted.
2. Iterate through the list, comparing adjacent elements.
3. If an element is greater than its adjacent element, swap them.
4. Continue iterating and swapping until the end of the list.
5. Repeat the process until no more swaps are needed, indicating the list is fully sorted.

### Key Characteristics

- Time Complexity: O(n^2) for the worst and average cases.
- In-place sorting: Requires minimal additional memory.
- Stable: Maintains the relative order of equal elements.

### Advantages and Disadvantages

#### Advantages

- Simplicity: Easy to understand and implement.
- In-place sorting: Does not require additional memory for sorting.

#### Disadvantages

- Inefficiency: Not suitable for large datasets due to its quadratic time complexity.
- Lack of adaptability: Performance remains the same regardless of the initial order of the elements.

### Use Cases

- Educational purposes: Often used to introduce sorting algorithms.
- Small datasets: Suitable for situations with a limited number of elements.

### Example

Consider an array: `[8, 2, 4, 1, 3]`

1. Initial state: `[8, 2, 4, 1, 3]`
2. After the first pass: `[2, 4, 1, 3, 8]`
3. After the second pass: `[2, 1, 3, 4, 8]`
4. After the third pass: `[1, 2, 3, 4, 8]`

### Conclusion

Bubble Sort, while not the most efficient, serves as a foundational sorting algorithm, illustrating the concept of
iterating through a list and swapping elements to achieve sorting.

# Selection Sort Algorithm

### Overview

- Selection Sort is a simple comparison-based sorting algorithm.
- It divides the array into two parts: a sorted part and an unsorted part.
- In each iteration, it finds the minimum (or maximum) element from the unsorted part and swaps it with the first
  element of the unsorted part.

### Algorithm Steps

1. Start with the entire array as the unsorted part.
2. Find the minimum (or maximum) element in the unsorted part.
3. Swap the found minimum (or maximum) element with the first element of the unsorted part.
4. Move the boundary between the sorted and unsorted parts to the right, excluding the element just sorted.
5. Repeat these steps until the entire array is sorted.

### Key Characteristics

- Time Complexity: O(n^2) for the worst and average cases.
- In-place sorting: Does not require additional memory for sorting.
- Number of swaps: Comparatively fewer than other quadratic sorting algorithms.

### Advantages and Disadvantages

#### Advantages

- Simplicity: Easy to understand and implement.
- In-place sorting: Requires minimal additional memory.

#### Disadvantages

- Inefficiency: Not suitable for large datasets due to its quadratic time complexity.
- Lack of adaptability: Performance remains the same regardless of the initial order of the elements.

### Use Cases

- Often used in educational settings to teach sorting algorithms.
- Suitable for small datasets or when the number of elements is known to be small.

# Insertion Sort Algorithm

### Overview

- Insertion Sort is a simple comparison-based sorting algorithm.
- It builds the final sorted array one element at a time.
- Elements are taken from the unsorted part and inserted into their correct position in the sorted part.

### Algorithm Steps

1. **Start with the second element:** Assume the first element is already sorted.
2. **Compare and insert:** Iterate through the unsorted part, compare each element with the sorted part, and insert it
   into its correct position.
3. **Repeat:** Continue this process until the entire array is sorted.

### Key Characteristics

- Time Complexity: O(n^2) for the worst and average cases.
- In-place sorting: Requires minimal additional memory.
- Adaptive: Efficient for small datasets or partially sorted arrays.

### Advantages and Disadvantages

#### Advantages

- Simple implementation.
- Efficient for small datasets or nearly sorted arrays.

#### Disadvantages

- Inefficiency for large datasets due to its quadratic time complexity.
- Less effective for unordered or large datasets compared to more advanced algorithms.

### Use Cases

- Efficient for small datasets or partially sorted arrays.
- Can be useful in scenarios where the array is continuously being built, and elements are added one at a time.

### Example

Consider an array: `[8, 2, 4, 1, 3]`

1. Initial state: `[8]` (Assuming the first element is already sorted).
2. After the first iteration: `[2, 8]`.
3. After the second iteration: `[2, 4, 8]`.
4. After the third iteration: `[1, 2, 4, 8]`.
5. After the fourth iteration: `[1, 2, 3, 4, 8]`.

### Conclusion

Insertion Sort efficiently builds a sorted array by repeatedly taking elements from the unsorted part and inserting them
into their correct position in the sorted part.

# Merge Sort Algorithm

## Overview

- Merge Sort is a divide-and-conquer algorithm used for sorting.
- It works by recursively dividing the input array into smaller subarrays until each subarray contains a single element.
- The sorted subarrays are then merged back together in a sorted order.

## Algorithm Steps

1. **Divide:** Recursively divide the unsorted array into smaller subarrays until each subarray contains a single
   element.
2. **Conquer:** Merge the sorted subarrays back together, combining them in a way that maintains a sorted order.

## Key Characteristics

- Time Complexity: O(n log n) for the worst, average, and best cases.
- Space Complexity: O(n) additional space for merging.

## Advantages and Disadvantages

### Advantages

- Consistent performance with O(n log n) time complexity.
- Stable sorting algorithm.

### Disadvantages

- Additional space complexity due to the need for temporary arrays.

## Use Cases

- Efficient for large datasets or linked lists.
- Suitable for scenarios where stable sorting is required.

## Example

Consider an array: `[8, 2, 4, 1, 3]`

1. Initial state: `[8, 2, 4]` and `[1, 3]`.
2. Subarray breakdown: `[8]`, `[2]`, `[4]`, `[1]`, `[3]`.
3. Merging: `[2, 8]`, `[1, 4]`, `[3]`.
4. Final merge: `[1, 2, 3, 4, 8]`.

## Conclusion

Merge Sort efficiently sorts an array by recursively dividing it into smaller subarrays, sorting each subarray, and then
merging them back together in a sorted order.

# Quick Sort Algorithm

## Overview

- Quick Sort is a highly efficient divide-and-conquer sorting algorithm.
- It works by selecting a "pivot" element and partitioning the other elements into two subarrays according to whether
  they are less than or greater than the pivot.
- The process is then applied recursively to the subarrays.

## Algorithm Steps

1. **Choose a Pivot:** Select a pivot element from the array.
2. **Partitioning:** Rearrange the array elements such that elements less than the pivot are on the left, and elements
   greater than the pivot are on the right.
3. **Recursive Calls:** Apply the quick sort algorithm recursively to the left and right subarrays.

## Key Characteristics

- Time Complexity: O(n log n) on average, O(n^2) in the worst case.
- In-place sorting: Requires minimal additional memory.

## Advantages and Disadvantages

### Advantages

- Highly efficient on average.
- In-place sorting minimizes additional memory usage.

### Disadvantages

- Performance can degrade in the worst case.
- Not stable: The relative order of equal elements may change.

## Use Cases

- Well-suited for large datasets.
- Efficient for scenarios where in-place sorting is desired.

## Example

Consider an array: `[8, 2, 4, 1, 3]`

1. Choose a pivot (e.g., `4`).
2. Partition the array: `[2, 1, 3]` (left) and `[8]` (right).
3. Recursive calls on the left and right subarrays.

## Conclusion

Quick Sort efficiently sorts an array by selecting a pivot, partitioning the array, and applying the process recursively
to the subarrays.

# Counting Sort Algorithm

## Overview

- Counting Sort is a linear-time sorting algorithm suitable for integers with a limited range.
- It works by counting the occurrences of each element and determining their final positions in the sorted output.

## Algorithm Steps

1. **Counting Occurrences:** Count the number of occurrences of each element in the input array and store this
   information in an auxiliary array.
2. **Cumulative Sum:** Modify the count array to represent the cumulative sum of counts.
3. **Place Elements:** Place each element in its correct sorted position based on the count information.
4. **Sorted Output:** Construct the sorted output array.

## Key Characteristics

- Time Complexity: O(n + k), where n is the number of elements, and k is the range of input values.
- Works well for a limited range of input values.
- Not suitable for sorting arbitrary data types.

## Advantages and Disadvantages

### Advantages

- Linear-time complexity for a specific range of input values.
- Stable sorting algorithm.

### Disadvantages

- Requires additional space proportional to the range of input values.
- Limited to sorting integers or objects with integer keys.

## Use Cases

- Efficient for sorting integers within a known range.
- Suitable for scenarios where stable sorting is required.

## Example

Consider an array: `[4, 2, 4, 1, 3, 4, 2]`

1. Count occurrences: `[0, 1, 2, 1, 3]` (representing counts of elements 1 to 5).
2. Cumulative sum: `[0, 1, 3, 4, 7]`.
3. Place elements in sorted positions based on counts.
4. Sorted output: `[1, 2, 2, 3, 4, 4, 4]`.

## Conclusion

Counting Sort efficiently sorts an array with a limited range of values by counting occurrences and determining the
sorted positions.








