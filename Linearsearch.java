
package linearsearch;
import java.util.Scanner;


public class Linearsearch {

    
    public static void main(String[] args) {
        int c, n, search, array[];
 
    Scanner in = new Scanner(System.in);
    System.out.println("How many elements: ");
    n = in.nextInt(); 
    array = new int[n];
 
    System.out.println("Enter " + n + " numbers:");
 
    for (c = 0; c < n; c++)
      array[c] = in.nextInt();
 
    System.out.println("Value to find:");
    search = in.nextInt();
 
    for (c = 0; c < n; c++)
    {
      if (array[c] == search)    
      {
         System.out.println(search + " is FOUND.");
          break;
      }
   }
   if (c == n) 
      System.out.println(search + " is not FOUND.");
  }
}


