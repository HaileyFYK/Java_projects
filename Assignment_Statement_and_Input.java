/**
 * Author: Hailey Kuo
 * Date: 9/10/2026
 * Description of Program: allow user to input width and height of rectangle and calculate area and perimeter
 */

import java.util.Scanner;

class Assignment_Statement_and_Input {
  public static void main(String[] args) {

    System.out.println("Calculate Area/Perimeter of a Rectangle");
    Scanner calculate = new Scanner(System.in);

    System.out.print("Enter width: ");
    double width = calculate.nextDouble();

    System.out.print("Enter height: ");
    double height = calculate.nextDouble();

    double area = width * height;
    double perimeter = 2 * (width + height);

    System.out.println(" ");

    System.out.println("Width = " + width + " units");
    System.out.println("Height = " + height + " units");
    System.out.println("Area = " + area + " square units");
    System.out.println("Perimeter = " + perimeter + " units");

    System.out.println(" ");

    calculate.close();
  }
}