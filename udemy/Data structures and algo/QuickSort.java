public class QuickSort {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
        
        quickSort(intArray, 0, intArray.length);   

        for (int i : intArray) {
            System.out.println(i);   
        }
    }

    public static void quickSort(int[] input, int start , int end) {
        if(end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start , end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // Using 1st element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i<j) {

            // ! NOTE: empty loop body
            // 20, 35, -15, 7, 55, 1, -22
            while (i<j && input[--j] >= pivot) ;
            // {
            if(i < j) {
                input[i] = input[j];
            }
            // }

            // ! NOTE: empty loop body
            // 20, 35, -15, 7, 55, 1, -22
            while (i<j && input[++i]<= pivot) ;
            // {
            if( i < j) {
                input[j] = input[i];
            }
            // }
        }

        input[j] = pivot;
        return j;
    }
}
