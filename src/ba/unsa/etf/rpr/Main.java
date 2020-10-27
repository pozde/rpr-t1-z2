package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int n;
	    Scanner in = new Scanner(System.in);
        System.out.println("Unesite n: ");
        n=in.nextInt();
        System.out.println("Brojevi izmedju 1 i n koji su djeljivi sa sumom svojih cifara su: ");
        for(int i=1;i<=n;i++){
            if(i%sumaCifara(i)==0){
                System.out.println(i + " ");
            }
        }



    }

    private static int sumaCifara(int n){
        int s = 0;
        while(n > 0){
            s = s + (n%10);
            n = n/10;
        }
        return s;
    }
}
