/**
 * it traverse an find the max value and put it in the end of element.
 * lastUnsortedIndex = length - last index of unsorted partition
 * i = length - index used to traverse the array from left to right
 * largest = 0(initial) - index fo largest element in unsorted partition
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
        for(int i=intArray.length-1; i>0; i--) {
            int largest = 0;
            for(int j=1; j<=i; j++) {
                if(intArray[j] > intArray[largest]) {
                    largest = j;
                }
            }
            swap(intArray, i, largest);
        }

        for(int i: intArray)
            System.out.println(i);
    }

    public static void swap(int[] array, int i, int j) {
        if(i==j)
            return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
