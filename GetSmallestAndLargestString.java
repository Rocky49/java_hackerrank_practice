import java.util.Scanner;
public class GetSmallestAndLargestString {

    public static String getSmallestAndLargest(String s, int k) {
        java.util.List<String> val = new java.util.ArrayList<>();
        for(int i=0; i<s.length()-(k-1); i++) {
            val.add(s.substring(i,i+k));
        }
        
        /** ALTERNATE SOLUTION for scanner class only **/
        // String smallest = "";
        // String largest = "";

        // for(int i=0; i<s.length()-(k-1); i++) {
        //     if(smallest == "" && largest == "") {
        //         smallest = s.substring(i,i+k); 
        //         largest = s.substring(i,i+k);
        //         }
        //     if(s.substring(i,i+k).compareTo(smallest) <0) smallest = s.substring(i,i+k);
        //     if(s.substring(i,i+k).compareTo(largest) >0) largest = s.substring(i,i+k); 
        // }

        /** If unable to import **/
        // java.util.stream.Stream<String> stream = val.stream();

        // val = stream.sorted().toList();
        
        val = val.stream().sorted().toList();
        
        return val.get(0) + "\n" + val.get(val.size()-1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
