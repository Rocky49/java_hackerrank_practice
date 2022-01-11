public class InsertionSortRecursive {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int unsortedIndex = 0; unsortedIndex < intArray.length; unsortedIndex++) {
            insertSort(intArray, intArray.length - 1);
        }

        for (int i : intArray) {
            System.out.println(i);
        }
    }

    public static void insertSort(int[] input, int numOfItem) {
        if (numOfItem < 2) {
            return;
        }

        insertSort(input, numOfItem - 1);

        int newEle = input[numOfItem];
        int i;
        for (i = numOfItem; i > 0 && input[i - 1] > newEle; i--) {
            input[i] = input[i - 1];
        }
        input[i] = newEle;
        
        System.out.println("num" + numOfItem);
        for (int ele : input) {
            System.out.print(ele+",");
        }
        System.out.println("");
        System.out.println("========================");
    }
}
