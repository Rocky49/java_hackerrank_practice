/* Read input from STDIN. Print your output to STDOUT*/

// import java.io.*;
import java.util.*;
public class CandidateCode {

   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner scan = new Scanner(System.in);
   int total = scan.nextInt();
   int counter = 0;
   int tempCounter = 0;
   String[] arr = new String[total+1];
   
   for(int i=0; i<=total; i++) {
      String temp = scan.nextLine();
      arr[i] = temp;
   }

   for(int i=0; i<=total; i++) {
      String temp = arr[i];
      int length = temp.length();

      for(int j=0; j<length; j++) {
         if( 1 == Integer.parseInt(temp.substring(j, j+1))) {
            tempCounter = tempCounter + 1;
         }
         if(tempCounter >= 2) {
            counter = counter + 1;
            break;
         }
      }
      tempCounter = 0;
   }

   System.out.println(counter);
   scan.close();
   long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
   long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
   long actualMemUsed=afterUsedMem-beforeUsedMem;
   System.out.println(actualMemUsed);
   }
   
}
