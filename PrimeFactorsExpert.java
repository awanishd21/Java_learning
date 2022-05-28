import java.util.Scanner;

public class PrimeFactorsExpert {
    public static void main(String [] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            primeFactors(n);
        }
    }

    public static void primeFactors(int n) {
        int p = 2;
        while(n > 1){
            if(n % p == 0){
                System.out.print(p + " ");
                n = n/p;
            }else{
                p++;
            }
        }
    }
}
