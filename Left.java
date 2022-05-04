package com.Package;
           //     space  star
 // 1 2 3 4 *      4 4-1+1     1
 // 1 2 3 * *      3      2
 // 1 2 * * *      2      3
//  1 * * * *      1      4
//  * * * * *      0      5




public class Left {

    public static void main(String[] args) {

        int a, b, s;  // a row, b space

        for (a = 0; a <5; a++) {
            for (b = 1; b <=5-a; b++) {
                System.out.print(" ");
            }
            for (s = 0; s <= a; s++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

