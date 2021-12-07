import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */        
        StringBuilder str = new StringBuilder();
        str.append(A);
        str.reverse();
        System.out.println(str.toString());
        System.out.println((str.toString().equals(A)) ? "YES" : "NO");
    }
}
