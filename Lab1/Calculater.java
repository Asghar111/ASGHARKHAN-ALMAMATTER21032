package Lab1;
import java.util.Scanner;
public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int hra;
       int specialallowance;
       int pf;
       int netpayblesalary;
       int basic salary=;
       
       System.out.println("enter the basic salary is:5000");
       Scanner scl = new Scanner(System.in);
       basicsalary=scl.nextInt();
       
       hra=(50*basicsalary)/100;
       specialallowance=(75*basicsalary)/100
       
       pf=(12*basicsalary)/100;
       netpayablesalary=basicsalary+hra+specialallowance-pf;
       
       System.out.println("Basic salary ="+basicsalary);
       System.out.println("HRA  ="+Hra);
       System.out.println("Soecial allowancce ="+specialallowance);
       System.out.println("PF  ="+pf);
       System.out.println("-------------");
       System.out.println("Net payable salary="+netpayablesalary);
	
	 }
	
}

	