package z_calismalar.OCI_sinav._223.Q008___Arrays;

public class Q008 {

    public static void main(String[] args) {
        String [] [] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " " );
                if (arr[i][j].equals("B")) {
                   continue; // bir etkisi yok... 1-continue ve break dan sonra bisey gelmez 2- continue varsa sadece ondan sonraki kodlari atlar

                }
            }
            continue;
        }

    }
}
    /*  What is the result?
        A.  A B C
        B.	A B C D E
        C.	A B D E
        D.	Compilation fails.


        continue; cannot be used outside of a loop
        break; can be used outside of a loop
        */





// Answer D: