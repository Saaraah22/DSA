package totalmax2;
import java.util.Scanner;
import java.util.Random;

public class TotalMax2 {
     int sum=0;
      int max=0;      
      int [] array;
       
      public void all (){
          int x=0;
          
           for(int i=0; i<array.length;i++){
              System.out.print(array[i] + "\t");
              x= x+1;
              if (x == 5){
              System.out.println( );
              x=0;
              }
            } System.out.println();
      }
      public void max(){
                  System.out.print("Maximum Number: ");

         max = array [0];
         for (int i=1; i<array.length; i++){
         if (array[i]>max) 
         {
             max=array[i]; 
         }
         
}
         System.out.print(max);
          }
     public void sum(){
         System.out.print("Sum: ");
          for (int i = 0; i<array.length; i++){
          sum +=array[i];
     
     }
          System.out.print(sum); 
          System.out.println();
     }
     public void ave(){
       double average = sum / array.length;  
         System.out.print("Average: " +average);
           System.out.println();
          }
          

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner (System.in);
          
        int size;
        TotalMax2 Array = new TotalMax2();
         
        System.out.print("Array Capacity:  ");
        size= input.nextInt();
        Array.array = new int[size];
         
        for (int i=0;i<size;i++){
        Array.array[i] = rand.nextInt(1000);
        } 
        System.out.println();
        
         Array.all();
         Array.sum();
         Array.ave();
         Array.max();

       
    }
}
