package z_calismalar.OCI_sinav._223.Q093;

class Product {
    int id;
    String name;
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {
//And given the code fragment:
        Product p1 = new Product(101, "Pen");
        Product p2 = new Product(101, "Pen");
        Product p3 = p1;
        boolean ans1 = p1 == p2;
        boolean ans2 = p1.name.contentEquals(p2.name);
        System.out.println(ans1 + ":" + ans2);




        boolean xx = p3==p1; //true
        System.out.println(xx);

    }
}
	/*
	 * What is the result?
		A. true:true
		B. true:false
		C. false:true
		D. false:false

		Answer: C
	 */