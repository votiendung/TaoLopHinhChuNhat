import TaoLopHinhChuNhat.Rectangle;

import java.util.Scanner;



    public class TaoLop {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Width");
            double width = sc.nextDouble();
            System.out.println("Enter the height");
            double height = sc.nextDouble();


            Rectangle rectangle = new Rectangle(width,height);
            System.out.println("Your Rectangle \n"+ rectangle.display());
            System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
            System.out.println("Area of the Rectangle: "+ rectangle.getArea());
        }

}
