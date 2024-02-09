import java.util.*;

public class converter {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("ENTER INDIAN RS:-");
    int rs = sc.nextInt();

    double us = rs * 81.6012;

    System.out.println("US Dollars: " + us);
  }
}