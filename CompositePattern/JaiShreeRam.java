package CompositePattern;

import java.util.Scanner;

public class JaiShreeRam {
    public static void main(String[] args) {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and col value <Select a number between 10 to 50 > :- ");
        n=sc.nextInt();
        sc.close();
        int row = n, col = n;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
                if (i < row / 2){
                    if (j < col / 2){
                        if (j == 0)
                            System.out.print("*");
                        else
                            System.out.print(" "+ " ");
                            }
                    else if (j == col / 2)
                        System.out.print(" *");
                    else{
                        if (i == 0)
                            System.out.print(" *");
                            }
                        }
                        else if (i == row / 2)
                            System.out.print("* ");
                        else{
                            if (j == col / 2 || j == col - 1)
                                System.out.print("* ");
                            else if (i == row - 1){
                                if (j <= col / 2 || j == col - 1)
                                    System.out.print("* ");
                                else
                                    System.out.print(" "+ " ");
                            }
                            else
                                System.out.print(" "+" ");
                        }
                    }
                    System.out.print("\n");
                }
            };
        }


