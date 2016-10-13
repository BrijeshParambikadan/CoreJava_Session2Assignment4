// Program to find the highest among the given 3 numbers

import java.util.Scanner;

public class J_S2A4 {

	public static void main(String[] args) {
		 
		      int a, b, c;
		      System.out.println("Enter three integers ");
		      
		      Scanner in = new Scanner(System.in);
		 
		      System.out.println("Enter value for FIRST Integer Number : ");
		      a = in.nextInt();
		      System.out.println("Enter value for SECOND Integer Number : ");
		      b = in.nextInt();
		      System.out.println("Enter value for THIRD Integer Number : ");
		      c = in.nextInt();
		 
		      if ( a > b && a > c )
		         System.out.println("FIRST Number "+a+" is the largest"+" than SECOND Number "+b+" & THIRD Number "+c);
		      else if ( b > a && b > c )
		         System.out.println("SECOND Number "+b+" is the largest"+" than FIRST Number "+a+" & THIRD Number "+c);
		      else if ( c > a && c > b )
		         System.out.println("THIRD Number "+c+" is the largest"+" than FIRST Number "+a+" & SECOND Number "+b);
		      else   
		         System.out.println("All the three numbers are equal ");
		      
	}

}

// Thank You