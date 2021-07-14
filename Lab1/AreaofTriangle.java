package Lab1;
import java.util.Scanner;
import java.util.scanner;
public class AreaofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the width of the Triangle:");
       double base = scanner .nextDouble();
       System.out.println("Enter the Height of the Triangle:");
       douuble height = scanner .nextDouble();
       //Area = (width*height)/2
       double area =(base*height)/2;
       System.out.println("Area of triangle is: " +area);
	}

}
