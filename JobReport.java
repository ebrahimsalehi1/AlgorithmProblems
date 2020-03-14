/**
 * @author Ebrahim Salehi
 * we want to make a program to solve a problem, below you can find 3 steps which can help to solve problem
 * 
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Bottle
{
	private int index;
	private int capacity;
	public Bottle(int index, int capacity) {
		super();
		this.index = index;
		this.capacity = capacity;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return "Bottle [index=" + index + ", capacity=" + capacity + "]";
	}	
}

public class JobReport {
	
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	
        int n = sc.nextInt();
        if(!(n>=1 && n<=100)) {
        	System.out.println("n must be 1<=n<=100");
        	System.exit(0);
        }
        
        int k = sc.nextInt();
        if(!(k>=1 && k<=100_000)) {
        	System.out.println("k must be 1<=k<=100_000");
        	System.exit(0);
        }
        
        List<Bottle> c = new ArrayList<>();
        int ci;
        for(int i=0;i<n;i++) {
            ci = sc.nextInt();
            if(!(ci>=1 && ci<=1000)) {
            	System.out.println("c[i] must be 1<=c[i]<=1000");
            	System.exit(0);
            }
            c.add(new Bottle(i+1, ci));
        }
        
        //-----------------------------------
        
        Long sum1 = c.stream().mapToLong(item->item.getCapacity()).sum();
        if(sum1>=k)
        	System.out.println("YES");
        else
        	System.out.println("NO");

    }

}
