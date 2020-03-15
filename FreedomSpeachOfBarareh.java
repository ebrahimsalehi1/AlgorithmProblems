import java.util.Scanner;

public class FreedomSpeachOfBarareh {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int k = sc.nextInt();

        if(k%2==0){
            System.out.println("Bala Barare");
        }
        else{
            System.out.println("Payin Barare");
        }
    }
}
