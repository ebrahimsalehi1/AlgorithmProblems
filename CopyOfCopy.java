import java.util.Scanner;
import java.util.regex.Pattern;

public class CopyOfCopy {

    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        int n = sc.nextInt();
        if(!(n>=0 && n<=100))
        	System.exit(0);
        
        String s = sc.next();
        
        if(!Pattern.matches("[a-z]+",s))
        	System.exit(0);
        
        for(int i=0;i<n;i++) {
        	System.err.print("copy of ");
        }
        
        if(n>0)
        	System.out.println(s);


	}

}
