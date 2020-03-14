/**
 * 
 * @author Ebrahim Salehi
 *	Question:
 *	Poouan wants to make some roads for losing his weight so he decides to do this following actions
 *  he has N lines to make a road in a square shape, also he wants to make maximum parts N lines.
 *  for, example if N is equal to 3 and he makes 3 vertical lines, so the ground is divided into 4 parts but if
 *   he makes 1 horizontal line and 2 vertical lines the ground is divided into 6 parts.
 *  give N from the input and say to him maximum parts which we can make with it
 *  input : N 
 *  output : maximum parts 
 *
 */

import java.util.Scanner;

public class MakeRoad {
    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        int n = sc.nextInt();
        int rows = n/2;
        int cols = n-rows;
        int result = (rows+1)* (cols+1);
        
        System.out.println(result);
	}
}
