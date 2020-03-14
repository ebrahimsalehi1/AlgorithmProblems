
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HistoricalInscription {

    static Scanner sc = new Scanner(System.in);
    static char[][] mat;
    
	public static void main(String[] args) {
        int n = sc.nextInt();
        if(!(n>=1 && n<=100)) {
        	System.out.println("n must be 1<=n<=100");
        	System.exit(0);
        }
        
        int m = sc.nextInt();
        if(!(m>=1 && m<=100)) {
        	System.out.println("m must be 1<=m<=100");
        	System.exit(0);
        }
        
        mat = new char[n][m];
        
        
        for(int i=0;i<n;i++) {
            	        	
            String rowData = sc.next();
            mat[i] = rowData.toCharArray();
            
        }
        
        //-----------------------------------
        int max = m>n ? m :n;
        int count=0;
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
            	
            		count += checkNode(i, j, m);
            }
        }
        
        System.out.println(count);

	}
	
	static int checkNode(int i,int j,int m) {
						
		if(mat[i][j]=='.')
			return 0;
		
		List<Integer> listRows = new ArrayList<>();
		List<Integer> listCols = new ArrayList<>();
		int count;
		try {
			count=1;
			for(int index=i-1;index>=0;index--) {
		
					if(mat[index][j]=='.')
						return 0;
					
					count++;
					if(count>=4 && count%2==0)
						listRows.add(count);
				
			}
		} catch (ArrayIndexOutOfBoundsException  e) {
			return 0;
		}
		
				
		try {
			count=1;
			for(int index=j+1;index<m;index++) {
					if(mat[i][index]=='.')
						return 0;	
					
					count++;
					if(count>=2)
						listCols.add(count);

			}
		} catch (ArrayIndexOutOfBoundsException  e) {
			return 0;
		}
		
		count=0;
		for(int x : listCols) {
			if(listRows.contains(x*2))
				count++;
		}
							
		return count;
	}

}
