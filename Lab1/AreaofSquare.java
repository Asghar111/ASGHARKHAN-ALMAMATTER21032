package Lab1;
import java.util.Scanner;
public class AreaofSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter sides of the Square:");
         //Capture the user's input
        Scanner scanner = new Scanner (System.in);
        //Storing the captured value in a variable
        double side = scanner .nextdouble();
        //Area of the Square = side*side
        double area = side*side;
        System.out.println("Area of the square is: "+area);
	}

}
