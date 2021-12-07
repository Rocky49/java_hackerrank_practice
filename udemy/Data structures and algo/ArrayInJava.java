/**
 * ** Add Sugar to Tea *
 * 1. Fetch the bowl containing the Sugar.
 * 2. Get a Spoon.
 * 3. Scoop out sugar using the spoon.
 * 4. pour the sugar from the spoon into the tea.
 * 5. Repeat steps 3 and 4 until you've added the desired amount of sugar.
 */

 /**
  * time complexity:
  O(1),
  O(logn),
  O(sqrt(n)),
  O(nlogn),
  O(nlogn),
  O(n^2),
  O(2^n),
  O(n!),
  */

    /**
     * array int[] is stored in contiguous memory that is one after another and in a single space
     * it occupies same amount of memory
     * 
     */

     /**
      * ### how to find memory address of in array? ###
      as all element in array is stored one after another
      and each element occupies same memory we can do the following:
      firstAddres + (index * elementSize)
      we can get the memory address of the index
      e.g : 
      firstAddrees = 12 elementSize = 4 bytes
      addres a[0] =12 + (0 * 4) = 12
      addres a[1] =12 + (1 * 4) = 16
      .
      .
      .
      addres a[5] =12 + (5 * 4) = 32
      */

      /**
       // For array operation the step to retrieva and array is always 3 so it is of time complexity O(1) 
       // NOTE: Only when we know the index
       */


class ArrayInJava {
    public static void main(String[] args) {
        int[] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;
        
        for(int val : intArray) {
            System.out.println(val);
        }
     }
}