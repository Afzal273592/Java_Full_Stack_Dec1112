package decClass1112;

import java.util.Scanner;

public class dec1122Assignments {

	public static void selectionExample() {

		String inp = "DEC 11-12 Assignments.";
		String tabl = "Table ";
		String fact = "Factorial";
		String perm = "Permutation";
		String comb = "Combination";
		String oper = "Incement Decrement Operator";

		String[] array = { inp, tabl, fact, perm, comb, oper };

		for (int i = 0; i < array.length; i++) {		
			if(array[i]==array[0]) {
				System.out.println("    " + array[i] );
			}else{
				System.out.println("     " + i + ". " + array[i]  );
			}
			
		}	

		System.out.println("Please select the assignment number! ");

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		switch (num) {
		case 1:
			System.out.println("Please enter the number for table.");
			int tnum = scan.nextInt();
			Table(tnum);
			break;
		case 2:
			System.out.println("Please enter the number to calculate factorail.");
			int fnum = scan.nextInt();
			factorial(fnum);
			System.out.println("Factorial of givnen number " + fnum + " is = " + factorial(fnum));
			break;
		case 3:
			System.out.println("P(n,r). Please enter the set or population n = ");
			int Pn = scan.nextInt();
			System.out.println("P(n,r). Please enter subset of n or sample set. r = ");
			int Pr = scan.nextInt();
			permutationExample(Pn, Pr);
			break;
		case 4:
			System.out.println("C(n,r). Please enter the set or population n = ");
			int Cn = scan.nextInt();
			System.out.println("C(n,r). Please enter subset of n or sample set. r = ");
			int Cr = scan.nextInt();
			combinationExample(Cn, Cr);
			break;
		case 5:
			System.out.println("Enter the first number.");
			int num1 = scan.nextInt();
			System.out.println("Enter the second number.");
			int num2 = scan.nextInt();
			preIncrement(num1, num2);
			postIncrement(num1, num2);
			preDecrement(num1, num2);
			postDecrement(num1, num2);
			break;
		default:
			System.out.println("Selection is not valid. Please select the correct number.");

		}

	}

	public static int permutationExample(int num, int r) {
		int result = (factorial(num) / (factorial(r) * factorial(num - r)));
		System.out.println("Permutation (nPr) of givnen number " + num + " is = " + result);
		return result;
	}

	public static int combinationExample(int num, int r) {
		int result = (factorial(num) / factorial(num - r));
		System.out.println("Combination  (nCr) of givnen number " + num + " is = " + result);
		return result;
	}

	public static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;

	}

	public static void Table(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + n * i);
		}

	}

	public static int maximum(String[] array) {
		int maximum = array[0].length();
		for (int i = 1; i < array.length - 1; i++) {
			if (array[i].length() > maximum) {
				maximum = array[i].length();
			}
		}

		return maximum;
	}

	
	static void preIncrement(int num2, int num1) {
		System.out.println("Pre-Increment(++i) (num2=++num1) --->(" + num2+ "=++"+ num1 +")" );
		System.out.println("num1 value before Pre-Increment num1="+ num1);
		System.out.println("num2 value before Pre-Increment num2="+ num2);
		 num2 =++num1;
		System.out.println("num1 value after Pre-Increment num1= "+ num1);
		System.out.println("num2 value after Pre-Increment num2="+ num2);
	}
	static void postIncrement(int num2, int num1) {
		System.out.println("Post-Increment(i++) (num2=num1++) --->(" + num2+ "="+ num1 +"++)");
		System.out.println("num1 value before Post-Increment num1="+ num1);
		System.out.println("num2 value before Post-Increment num2="+ num2);
		num2 =num1++;
		System.out.println("num1 value after Post-Increment num1="+ num1);
		System.out.println("num2 value after Post-Increment num2="+ num2);
	}
	
	static void preDecrement(int num2, int num1) {
		System.out.println("Post-decrement(--i) (num2=--num1) --->(" + num2+ "=--"+ num1 +")");
		System.out.println("num1 value before Pre-Increment num1= "+ num1);
		System.out.println("num2 value before Pre-Increment num2="+ num2);
		num2 =--num1;
		System.out.println("num1 value after Pre-Increment num1="+ num1);
		System.out.println("num2 value after Pre-Increment num2="+ num2);
	}
	static void postDecrement(int num2, int num1) {
		System.out.println("Post-decrement(i--) (num2=num1--) --->(" + num2+ "="+ num1 +"--)");
		System.out.println("num1 value before Post-Increment num1= "+ num1);
		System.out.println("num2 value before Post-Increment num2="+ num2);
		num2 =num1--;
		System.out.println("num1 value after Post-Increment num1="+ num1);
		System.out.println("num2 value after Post-Increment num2="+ num2);
	}
	
	
	public static void main(String[] args) {

		dec1122Assignments assignment = new dec1122Assignments();

//	assgnm.Table(5);
//	assgnm.Factorial(10);		
//	assgnm.permutationExample(10, 3);
//	assgnm.combinationExample(10, 3);			
//	assgnm.selectionExample();

		String awnser = "";
		do {
			assignment.selectionExample();

			Scanner scan = new Scanner(System.in);
			System.out.println("Do you wnat to Continue (Y/N)?");
			awnser = scan.next();

		} while (awnser.equalsIgnoreCase("Y"));

	}

}
