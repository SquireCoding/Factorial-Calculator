import java.math.BigInteger;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("\n\n\nWhat is the number you want to ! ?");
    try {
      Scanner s = new Scanner(System.in);
      BigInteger b = new BigInteger(s.nextLine());
      BigInteger total = new BigInteger(b.toString());
      for (BigInteger i = b.subtract(BigInteger.ONE); !i.toString().equals("0"); i = i.subtract(BigInteger.ONE)) {
        total = total.multiply(i);
      }
      System.out.println(b.toString() + "! is equal to " + total.toString());
      long result = 0;
      for (char i : total.toString().toCharArray()) {
        result += Integer.parseInt(String.valueOf(i));
      }
      System.out.println("There are " + total.toString().toCharArray().length + " digits in that number.");
      System.out.println("The sum of all those digits is " + result);
    } catch (Exception e) {
      System.out.println("Something went wrong. Please make sure you are using valid numbers.");
    }
  }
}
