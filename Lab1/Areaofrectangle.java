package Lab1;
import java.util.Scanner;
public class Areaofrectangle {

	public static void main(String[] args) {
		  // TODO Auto-generated method stub
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the length of the rectangle:");
          double length = scanner .nextdouble();
          System.out.println("Enter the Width of the Rectangle:");
          double width = scanner .nextDouble();
          //Area = length*width;
          double area = length*width;
          System.out.println("Area of Rectngle is:"+area);
    
	}

}
