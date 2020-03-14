import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MetalShell {

    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        int t = sc.nextInt();
        int w = sc.nextInt();
        
        long sumOfPow = 0;
        for(int i=0;i<w;i++) {
        	sumOfPow += Math.pow(2, i);
        }
        
        BigDecimal result = new BigDecimal( (t*Math.pow(2,w-1)/sumOfPow));
      
        DecimalFormat df = new DecimalFormat("0.0000");
        
        System.out.println(df.format(result));

	}

}
