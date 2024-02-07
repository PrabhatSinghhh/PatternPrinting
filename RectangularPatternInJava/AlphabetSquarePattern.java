package RectangularPatternInJava;

import java.util.Scanner;

public class AlphabetSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int m= sc.nextInt();

        for (int i=1; i<=m;i++){  //for no of rows
            for (int j= 1;j<=m;j++){  //for no of columns
                System.out.print((char) (64+j) + " ");
            }
            System.out.println( );
        }
    }
}


