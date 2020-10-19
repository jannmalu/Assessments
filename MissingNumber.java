import java.util.Scanner;
public class MissingNumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int n = sc.nextInt();
      int inputArray[] = new int[n];
      System.out.println("Enter the numbers in your array: ");
      for(int i=0; i<=n-2; i++) {
         inputArray[i] = sc.nextInt();
      }
      int allNumbers = (n*(n+1))/2; 
      int sumOfArray = 0;

      for(int i=0; i<=n-2; i++) {
         sumOfArray = sumOfArray+inputArray[i];
      }
      int missingNumber = allNumbers-sumOfArray;
      System.out.println("Missing number is: " +missingNumber);

      sc.close();
   }
}