package day36_InterviewQuestions.J40__InterviewQuestions.Day04;

import java.util.Scanner;

public class Q03_CountFactors {
      /*
        Type java code by using while loop,
       Write a program to count the factors of an integer which is entered by user.
       Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
       Factors of 8  = 1, 2, 4, 8 ==> 4
*/
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.print("carpanlarini bulmak istediginiz sayiyi giriniz :");
          int sayi = Math.abs(scan.nextInt()); //sayinin mutlak degerini aldik..
          int i = 1;
          int counter=1;
//          while (i<=(sayi/2)) {
//              if (sayi%i == 0 ) {
//                  counter++;
//                  System.out.print(i+" ");
//              }
//              i++;
//          }
//          System.out.println(sayi);
          while (i<=(sayi)) {
              if (sayi%i == 0 ) {
                  counter++;
                  System.out.print(i+" ");
              }
              i++;
          }

          System.out.println("Çarpan sayısı = "+counter);

      }

}
