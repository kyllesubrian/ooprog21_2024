import java.util.Scanner;
public class AscendingAndDescending{
   public static void main(String [] a){
      Scanner scanner = new Scanner(System.in);
      
      
      System.out.print("1st number: ");
      int num1 = scanner.nextInt();
      System.out.print("2nd number: ");
      int num2 = scanner.nextInt();
      System.out.print("3rd number: ");
      int num3 = scanner.nextInt();
      
      if (num1 >= num2 && num2 >= num3){
         System.out.print("The numbers in descending order: "+ num1 + "," + num2 + "," + num3 );
      }else{
            
            int max = Math.max(num1, Math.max(num2, num3));
            int min = Math.min(num1, Math.min(num2, num3));
            int mid = num1 + num2 + num3 - max - min;
      
         System.out.println("The numbers in ascending order: " + min+ ", " + mid + ", " + max);
  
      }
     
      }
}
