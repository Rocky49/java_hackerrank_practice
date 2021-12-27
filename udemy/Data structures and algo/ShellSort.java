/**
 * Shellsort
 * author: Donald Shell
 */

public class ShellSort {
    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            /**
             * 1st iteration: i = 3
             * newElement = intArray[3] // 7
             * j = 3;
             * while loop : // 1st iteration
             *      intArray[j] //7 = intArray[3-3 i.e 0] // 20 new assigned value
             *      j = j-gap; // j = 3-3 = 0
             * while loop end
             * intArray[j i.e 0] (prev. value 20) = 7
             */
            for (int i = gap; i < intArray.length; i++ ) {
                int newElement = intArray[i];
                int j = i;

                while(j>=gap && intArray[j-gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }

        for (int i : intArray) {
            System.out.println(i);   
        }
        
    }
}
