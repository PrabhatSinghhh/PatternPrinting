package RectangularPatternInJava;

import java.util.Scanner;

public class SquarePatternMethod3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int m= sc.nextInt();
        System.out.println("enter the no columns");
        int n= sc.nextInt();
        for (int i=1; i<=m;i++){  //for no of rows
            for (int j= 1;j<=n;j++){  //for no of columns
                System.out.print(" *");
            }
            System.out.println( );
        }
    }
}
