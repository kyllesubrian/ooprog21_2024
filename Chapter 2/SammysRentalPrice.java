import java.util.Scanner;

public class sammyseashoresupplies{

   public static void main(String[] args){
   
   int COST_PER_HOUR = 40;
   int COST_PER_MINUTE = 1;
   
   Scanner scanner = new Scanner(System.in);
   System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
   System.out.println("S Sammy's makes it fun in the sun. S");
   System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
   System.out.println("Welcome to Sammy's Seashore Supplies ");
   
   System.out.print("Enter the number of minutes rented a piece of sports equipment: ");
   int minutesRented = scanner.nextInt();
   
   int hours = minutesRented / 60;
   int minutes = minutesRented % 60;
   
   int totalPrice = (hours * COST_PER_HOUR) + (minutes * COST_PER_MINUTE);
   
   System.out.println("Hours rented: "+ hours);
   System.out.println("minute rented: "+ minutes);
   System.out.println("The Total Price: "+ totalPrice);
   
   
   }
}
