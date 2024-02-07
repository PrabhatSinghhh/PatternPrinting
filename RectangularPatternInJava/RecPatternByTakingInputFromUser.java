package RectangularPatternInJava;

import java.util.Scanner;

public class RecPatternByTakingInputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows ");
        int m= sc.nextInt();     //for row
        System.out.println("Enter the no of columns");
        int n= sc.nextInt();     // for columns
        for (int i =1; i<=m; i++ ){
            for (int j= 1; j<=n; j++){
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}
