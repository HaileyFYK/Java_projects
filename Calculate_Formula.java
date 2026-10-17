/**
 * Author: Hailey Kuo
 * Date: 9/15/2026
 * Description of Program: allow uer to input dimensions of different figure/shapes and calculate area, perimeter, surface area, and/or volume
 */

import java.util.Scanner;

public class Calculate_Formula
{
    public static void main(String[] args)
    {
        Scanner cal = new Scanner(System.in);
        
        //Square
        System.out.print("Enter side length of Square: ");
        double square_side = cal.nextDouble();
        
        double square_area = square_side * square_side;
        double square_perimeter = 4 * square_side;
        
        System.out.println("Square Side Length = " + square_side + " units");
        System.out.println("Square Area = " + square_area + " square units");
        System.out.println("Square Perimeter = " + square_perimeter + " units");
        System.out.println(" ");
        
        //Rectangle
        System.out.print("Enter width of Rectangle: ");
        double rectangle_width = cal.nextDouble();
        System.out.print("Enter length of Rectangle: ");
        double rectangle_length = cal.nextDouble();
        
        double rectangle_area = rectangle_width * rectangle_length;
        double rectangle_perimeter = 2 * (rectangle_width + rectangle_length);
        
        System.out.println("Rectangle Width = " + rectangle_width + " units");
        System.out.println("Rectangle Height = " + rectangle_length + " units");
        System.out.println("Rectangle Area = " + rectangle_area + " square units");
        System.out.println("Rectangle Perimeter = " + rectangle_perimeter + " units");
        System.out.println(" ");

        //Triangle
        System.out.print("Enter side a of triangle: ");
        double triangle_side_a = cal.nextDouble();
        System.out.print("Enter side b/base of triangle: ");
        double triangle_side_b = cal.nextDouble();
        System.out.print("Enter side c of triangle: ");
        double triangle_side_c = cal.nextDouble();
        System.out.print("Enter the height of triangle: ");
        double triangle_height = cal.nextDouble();   
        
        double triangle_area = 0.5 * (triangle_side_b * triangle_height);
        double triangle_perimeter = triangle_side_a + triangle_side_b + triangle_side_c;
        
        System.out.println("Triangle Side a = " + triangle_side_a + " units");
        System.out.println("Triangle Side b = " + triangle_side_b + " units");
        System.out.println("Triangle Side c = " + triangle_side_c + " units");
        System.out.println("Triangle Height: " + triangle_height + " square units");
        System.out.println("Triangle Area = " + triangle_area + " units");
        System.out.println("Triangle Perimeter = " + triangle_perimeter + " units");
        System.out.println(" ");

        //Parallelogram
        System.out.print("Enter side a of parallelogram: ");
        double parallelogram_side_a = cal.nextDouble();
        System.out.print("Enter side b/base of parallelogram: ");
        double parallelogram_side_b = cal.nextDouble();
        System.out.print("Enter the height of parallelogram: ");
        double parallelogram_height = cal.nextDouble();
        
        double parallelogram_area = parallelogram_side_b * parallelogram_height;
        double parallelogram_perimeter = 2 * (parallelogram_side_a + parallelogram_side_b);

        System.out.println("Parallelogram Side A = " + parallelogram_side_a + " units");
        System.out.println("Parallelogram Side B = " + parallelogram_side_b + " units");
        System.out.println("Parallelogram Height = " + parallelogram_height + " units");
        System.out.println("Parallelogram Area = " + parallelogram_area + " square units");
        System.out.println("Parallelogram Perimeter = " + parallelogram_perimeter + " units");
        System.out.println(" ");
        
        //Pythagorean theorem
        System.out.print("Enter pythagorean side a/opposite side: ");
        double pythagoream_side_a = cal.nextDouble();
        System.out.print("Enter pythagorean side b/adjacent side: ");
        double pythagoream_side_b = cal.nextDouble();
        System.out.print("Enter pythagorean side c/hypotenuse side: ");
        double pythagoream_side_c = cal.nextDouble();

        double pythagoream_a = pythagoream_side_a *  pythagoream_side_a;
        double pythagoream_b = pythagoream_side_b *  pythagoream_side_b;
        double pythagoream_c = pythagoream_side_c *  pythagoream_side_c;
        
        System.out.println("Pythagorean theorem side a = " + pythagoream_side_a + " units");
        System.out.println("Pythagorean theorem side b = " + pythagoream_side_b + " units");
        System.out.println("Pythagorean theorem side c = " + pythagoream_side_c + " units");
        System.out.println("Pythagorean theorem: " + pythagoream_a + " + " + pythagoream_b + " = " + pythagoream_c);
        System.out.println(" ");
        
        //Circular ring
        System.out.print("Enter circular ring outer radius: ");
        double circular_R = cal.nextDouble();
        System.out.print("Enter circular ring inner radius: ");
        double circular_r = cal.nextDouble();        
        
        double circular_area = 3.14 * (circular_R * circular_R - circular_r * circular_r);
        
        System.out.println("Circular ring outer radius = " + circular_R + " units");
        System.out.println("Circular ring inner radius = " + circular_r + " units");
        System.out.println("Circular ring area = " + circular_area + " square units");
        System.out.println(" ");

        //Sphere
        System.out.print("Enter sphere radius: ");
        double sphere_radius = cal.nextDouble();
        
        double sphere_surface_area = 4 * 3.14 * sphere_radius * sphere_radius;
        double sphere_volume = (4.0 / 3.0) * 3.14 * sphere_radius * sphere_radius * sphere_radius;

        System.out.println("Sphere radius = " + sphere_radius + " units");
        System.out.println("Sphere surface area = " + sphere_surface_area + " cube units");
        System.out.println("Sphere volume = " + sphere_volume + " cube units");
        System.out.println(" ");
        
        //Trapezoid
        System.out.print("Enter Trapezoid side a: ");
        double trapezoid_side_a = cal.nextDouble();
        System.out.print("Enter Trapezoid side b: ");
        double trapezoid_side_b = cal.nextDouble();
        System.out.print("Enter Trapezoid side c: ");
        double trapezoid_side_c = cal.nextDouble();
        System.out.print("Enter Trapezoid side d: ");
        double trapezoid_side_d = cal.nextDouble();
        System.out.print("Enter Trapezoid height: ");
        double trapezoid_height = cal.nextDouble();
        
        double trapezoid_area = trapezoid_height * ((trapezoid_side_a + trapezoid_side_b) / 2);
        double trapezoid_permiter = trapezoid_side_a + trapezoid_side_b + trapezoid_side_c + trapezoid_side_d;

        System.out.println("Trapezoid side a = " + trapezoid_side_a + " units");
        System.out.println("Trapezoid side b = " + trapezoid_side_b + " units");
        System.out.println("Trapezoid side c = " + trapezoid_side_c + " units");
        System.out.println("Trapezoid side d = " + trapezoid_side_d + " units");
        System.out.println("Trapezoid height = " + trapezoid_height + " units");
        System.out.println("Trapezoid area = " + trapezoid_area + " square units");
        System.out.println("Trapezoid perimeter = " + trapezoid_permiter + " units");
        System.out.println(" ");
        
        //Rectangular box
        System.out.print("Enter Rectangular box side a/height: ");
        double rectangular_side_a = cal.nextDouble();
        System.out.print("Enter Rectangular box side b/length: ");
        double rectangular_side_b = cal.nextDouble();
        System.out.print("Enter Rectangular box side c/width: ");
        double rectangular_side_c = cal.nextDouble();

        double rectangular_surface_area = 2 * (rectangular_side_a * rectangular_side_b + rectangular_side_a * rectangular_side_c + rectangular_side_b * rectangular_side_c);
        double rectangular_volume = rectangular_side_a * rectangular_side_b * rectangular_side_c;
        
        System.out.println("Rectangular box side a = " + rectangular_side_a + " units");
        System.out.println("Rectangular box side b = " + rectangular_side_b + " units");
        System.out.println("Rectangular box side c = " + rectangular_side_c + " units");
        System.out.println("Rectangular box surface area = " + rectangular_surface_area + " square units");
        System.out.println("Rectangular box volume = " + rectangular_volume + " cubic units");
        System.out.println(" ");
        
        //Cube
        System.out.print("Enter Cube side: ");
        double cube_side = cal.nextDouble();

        double cube_surface_area = 6 * (cube_side * cube_side);
        double cube_volume = cube_side * cube_side * cube_side;
        
        System.out.println("Cube side = " + cube_side + " units");
        System.out.println("Cube surface area = " + cube_surface_area + " square units");
        System.out.println("Cube volume = " + cube_volume + " cubic units");
        System.out.println(" ");

        //Cylinder
        System.out.print("Enter Cylinder radius: ");
        double cylinder_radius = cal.nextDouble();
        System.out.print("Enter Cylinder height: ");
        double cylinder_height = cal.nextDouble();
        
        double cylinder_surface_area = 2 * 3.14 * cylinder_radius * (cylinder_radius + cylinder_height);
        double cylinder_volume = 3.14 * cylinder_radius * cylinder_radius * cylinder_height;
        
        System.out.println("Cylinder radius = " + cylinder_radius + " units");
        System.out.println("Cylinder height = " + cylinder_height + " units");
        System.out.println("Cylinder surface area = " + cylinder_surface_area + " square units");
        System.out.println("Cylinder volume = " + cylinder_volume + " cubic units");
        System.out.println(" ");        
        
        //Right cirular cone
        System.out.print("Enter Right cirular cone radius: ");
        double cone_radius = cal.nextDouble();
        System.out.print("Enter Right cirular cone height: ");
        double cone_height = cal.nextDouble();  
        System.out.print("Enter Right cirular cone slant height: ");
        double cone_slant_height = cal.nextDouble();  
        
        double cone_surface_area = 3.14 * cone_radius * cone_radius + 3.14 * cone_radius * cone_slant_height;
        double cone_volume = (3.14 * cone_radius * cone_radius * cone_height) / 3;
        
        System.out.println("Right cirular cone radius = " + cone_radius + " units");
        System.out.println("Right cirular cone height = " + cone_height + " units");
        System.out.println("Right cirular cone slant height = " + cone_slant_height + " units");
        System.out.println("Right cirular cone surface area = " + cone_surface_area + " square units");
        System.out.println("Right cirular cone volume = " + cone_volume + " cubic units");
        System.out.println(" ");        
        
    }
}