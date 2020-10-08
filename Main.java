import java.util.Scanner;
/**
 * Gets the dot product from two vectors
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // create length of both arrays
    int arraysLength = 3;
    
    // get the 3 values for the first vector
    int[] vectorOne = new int[arraysLength];
    System.out.println("Please enter the 3 values for the first vector");
    for (int i = 0; i < arraysLength; i++) {
      vectorOne[i] = input.nextInt();
    }

    // get the 3 values for the second vector
    int[] vectorTwo = new int[arraysLength];
    System.out.println("Please enter the 3 values for the second vector");
    for (int i = 0; i < arraysLength; i++) {
      vectorTwo[i] = input.nextInt();
    }

    // declare the dot product variable
    int dotProduct = 0;
    
    // multiplies the pairings together (x1 * x2) and adds them to the dot product
    for (int i = 0; i < arraysLength; i++) {
      dotProduct = dotProduct + (vectorOne[i] * vectorTwo[i]);
    }
    
    // tells the user the dot product
    System.out.println("The dot product is " + dotProduct);
    
  }
}
