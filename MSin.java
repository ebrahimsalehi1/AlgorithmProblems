import java.util.Random;
import java.util.Scanner;

public class MSin {

    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        int m = sc.nextInt();
        if(!(m>=1 && m<=7))
        	System.exit(0);
        
        String[] arr7Sin = new String[] {"sib","samanoo","serkeh","sekeh","senjed","sir","sabzeh"};
        Random rndNum = new Random();
        int count = 0,index =0;
        do {
        	index = Math.abs(rndNum.nextInt() % 7);
        	//System.out.println(index);
        	if(arr7Sin[index]!="") {
        		System.out.println(arr7Sin[index]);
        		arr7Sin[index] = "";
            	count++;
            	if(count == m)
            		break;
        	}
        }while(true);
		
	}

}
