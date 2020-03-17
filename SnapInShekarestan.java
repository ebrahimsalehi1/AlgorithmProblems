import java.util.Scanner;

public class SnapInShekarestan {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int[] b = new int[m];
        int x, y;
        long sum = 0;

        for(int i=0;i<m;i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            sum += a[x-1][y-1];
        }

        System.out.println(sum);

    }

}
