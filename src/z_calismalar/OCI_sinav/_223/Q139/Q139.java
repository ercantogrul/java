package z_calismalar.OCI_sinav._223.Q139;

public class Q139 {
	 int count;

	public static void displayMsg() { // static olan method da static olmayan (variable ve methodlar) calismaz.

	 //System.out.println("Welcome visit count"+ count++); // line n1
		// hata burda cunku count u static bir method icinde cagirmaya calismis
		// instance variable static methodun icinde cagiramiyoruz
		// ama variable static olsaydi static methodun icinde cagirabilirdik
		// *** instance variable static olmayan bir methodun icinde cagirabiliriz
	}
	public static void main(String[] args) {
		// bir obj ile static olmayan method veya method cagrilabilir
		Q139.displayMsg(); //class name ile de cagrilir
		displayMsg();   //line 2

	}

}
/* answer line 1 complition error
	What is the result?
		A.	Welcome Visit Count:0Welcome Visit Count: 1
		B.	Compilation fails at line n2.
		C.	Compilation fails at line n1.
		D.	Welcome Visit Count:0Welcome Visit Count: 0

		Answer: C
*/
