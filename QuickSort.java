/**
 * Question: Write algorithm for Quick sort on an unsorted array of N elements and determine the time to sort the elements. Also discuss the best, worst and average cases
 * 
 * Algorithm:
1. Create a function quickSort that takes an array, a start index, and an end index as parameters.
2. Check if start is greater than or equal to end. If true, return, as the array is already sorted.
3. Find the pivot element using the partition function, and store its position in the variable pivot.
4. Recursively call quickSort on the left subpart of the array, from start to pivot - 1.
5. Recursively call quickSort on the right subpart of the array, from pivot + 1 to end.

Here's a concise algorithm for the partition function:

1. Choose the last element of the subarray (at index end) as the pivot.
2. Initialize a variable i to start - 1, which will keep track of the pivot position.
3. Iterate through the subarray from start to end - 1.
    a. If the current element is less than the pivot, increment i and swap the elements at indices i and j.
4. After the loop, increment i once more to place the pivot in its correct position.
5. Swap the pivot element with the element at index i.
6. Return the position of the pivot, which is i.

The main function serves as the driver code to test the QuickSort algorithm on a sample array.
 * 
 * Pseudocode:
function quickSort(array, start, end)
    if start >= end
        return  // Base case: array is already sorted

    pivot = partition(array, start, end)  // Find the pivot
    quickSort(array, start, pivot - 1)     // Recursively sort the left subarray
    quickSort(array, pivot + 1, end)       // Recursively sort the right subarray

function partition(array, start, end)
    pivot = array[end]  // Choose the last element as the pivot
    i = start - 1      // Initialize pivot position tracker

    for j from start to end - 1
        if array[j] < pivot
            i = i + 1
            swap(array[i], array[j])  // Swap elements less than pivot to the left

    i = i + 1
    swap(array[i], array[end])  // Swap pivot to its correct position
    return i  // Return the position of the pivot

// Driver code
array = [8, 6, 2, 1, 3, 9, 4, 7, 5]
quickSort(array, 0, array.length - 1)  // Call quickSort to sort the array
 * 
 * Flowchart URL:
 */

public class QuickSort {
    //quicksort driver that takes help of partition function
    private static void quickSort(int[] array, int start, int end) {
        if(start > end) return; // base case

        int pivot = partition(array, start, end); //finding the pivot
        quickSort(array,start,pivot-1); //recursive call on left subpart of array
        quickSort(array,pivot+1,end); //recursive call on right subpart of array
    }

    //function to partition the array into two subparts
    //left subpart has all elements less than pivot
    //right subpart has all elements more than pivot
    private static int partition(int[] array, int start, int end) {
        int pivot = array[end]; //choosing the last element as pivot
        int i = start - 1; //keep track of the pivot position

        for(int j = start; j <= end-1; j++) {
            if(array[j] < pivot) {
                i++;
                //swap the values less than pivot to the left subpart, the greater ones will automatically go to the right side
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        i++;
        //finally swap the pivot to its correct position
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        
        //return the position of the pivot
        return i;
    }

    // driver code
    public static void main(String[] args) {
    int[] array = {8,6,2,1,3,9,4,7,5};
    
    System.out.print("Before Sorting: ");
    for(int i : array)
        System.out.print(i+" ");

    quickSort(array,0,array.length-1); //calling quicksort function

    System.out.print("\nAfter Sorting: ");
    for(int i : array)
        System.out.print(i+" ");
    }
}
