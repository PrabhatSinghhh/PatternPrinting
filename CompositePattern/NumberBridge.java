package CompositePattern;

import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter n");
        int n = sc.nextInt();
        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
        n--;

        int nsp=1;

        for (int i = 1; i <= n ; i++) {
            int a=1;
            for (int j=1;j<=n+1-i;j++){
                System.out.print(a + " ");
                a++;
            }
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " +" ");
                a++;
            }
            nsp+=2;
            for (int j = 19;j<=n+19-i;j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
