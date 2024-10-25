import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // ---------- Problem 1 ----------
    System.out.println("Please enter a double:");
    double a = sc.nextDouble();

    if (a == 12.345) {
      System.out.println("YES");
    }


    // ---------- Problem 2 ----------
    System.out.println("Please enter an integer:");
    int b = sc.nextInt();

    if (b == 48) {
      System.out.println("YES");
    }


    // ---------- Problem 3 ----------
    System.out.println("Please enter two integers:");
    int c1 = sc.nextInt();
    int c2 = sc.nextInt();

    if (c2 == (c1*2)) {
      System.out.println("YES");
    }


    // ---------- Problem 4 ----------
    System.out.println("Please enter an integer:");
    int d = sc.nextInt();

    if ((d % 2) == 0) {
      System.out.println("Divisible by 2!");
    }
    if ((d % 3) == 0) {
      System.out.println("Divisible by 3!");
    }


    // ---------- Problem 5 ----------
    System.out.println("Please enter an integer:");
    int e = sc.nextInt();

    if ((e % 2) == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }


    // ---------- Problem 6 ----------
    System.out.println("Please enter a letter grade: ");
    sc.nextLine();
    String f = sc.nextLine();

    if (f.equals("A")) {
      System.out.println("90-100");
    } else if (f.equals("B")) {
      System.out.println("80-90");
    } else if (f.equals("C")) {
      System.out.println("70-80");
    } else if (f.equals("D")) {
      System.out.println("60-70");
    } else if (f.equals("F")) {
      System.out.println("0-60");
    } else {
      System.out.println("Invalid letter grade");
    }


    // ---------- Problem 7 ----------
    int x = (int) (Math.random()*51);
    int y = ((int) (Math.random()*51)) + 50;
    System.out.println(x + " + " + y + " = ?");
    int ans = sc.nextInt();

    if (ans == (x+y)) {
      System.out.println("Correct!");
    } else {
      System.out.println("Wrong");
    }


    // ---------- Problem 8 ----------
    System.out.println("What is the temperature?");
    int temp = sc.nextInt();

    if (temp <= 99 && temp >= 97 ) {
      System.out.println("Temperature is OK");
    } else {
      System.out.println("NOT NORMAL");
    }
  }
}
