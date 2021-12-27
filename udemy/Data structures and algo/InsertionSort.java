/**
 * Insertion sort: O(n^2)
 * it has two array unsorted and sorted
 * it take first element from unsorted and add it in sorted array
 * as its length is 1 it is already sorted array
 * then it traverse through each element in unsorted arr and the iterate through sorted and add the element into proper index
 * e.g [20, 14, 15] // unsorted
 * []  // 0
 * [20] //1
 * [14, 20] // check with 14 and element and add it before 20
 * [14, 15, 20] // check with 20 and then 14 and element and add it between 14 and 15
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
        
        for (int unsortedIndex = 0; unsortedIndex < intArray.length; unsortedIndex++) {
            int newEle = intArray[unsortedIndex];
            int i;
            for (i = unsortedIndex; i > 0 && intArray[i-1] > newEle;  i--) {
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newEle;
        }

        for(int i : intArray) {
            System.out.println(i);
        }
        
    }
}
