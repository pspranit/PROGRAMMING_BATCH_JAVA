

//* * * * *  *
//*       *  *
//*    *     *
//*  *       *
//* * *

package pattern;

import java.util.Scanner;

class Program4
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER ROWS");
        int row=sc.nextInt();

        System.out.println("ENTER COLUMN");
        int col=sc.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(i==1||i==5||j==1||j==5||i+j==6)
                {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}


