package day04_OperatorsAndMahtClass.DE03_OperatorsAndMathClass_ilk.tasks;

import java.util.Scanner;

public class _11_ArithmeticOperator_reminder1 {

    public static void main(String[] args) {

        /*  Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
            int sonucu yazdırın.  */

        Scanner dp = new Scanner(System.in);
        System.out.println("num1 giriniz :");

        int num1 = dp.nextInt();
        System.out.println("num2 giriniz :");
        int num2 = dp.nextInt();

        //Kodu aşağıya yazınız.
        System.out.println("kalan sayinin int sonucu = "+ (int)(num1%num2));




    }
}
