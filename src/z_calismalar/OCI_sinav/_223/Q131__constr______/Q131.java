package z_calismalar.OCI_sinav._223.Q131__constr______;

public class Q131 {

    class Vehicle {
        int x;
        Vehicle() {
            this(10);// line n1
        }
        Vehicle(int x) {
            this.x = x;
        }
    }
    class Car extends Vehicle {
        int y;
        Car() {
           // super();
          //this(20); // line n2
        }
        Car(int y) {
            this.y = y;
        }

        public String toString() {
            return super.x + ":" + this.y;
        }
    }
    public static void main(String[] args) {
       //Vehicle y = new Car();
       //System.out.println(y);

    }
}

//What is the result?
//A. Compilation fails at line n2.
// B. Compilation fails at line n1.
// C. 20:20
//D. 10:20
//Answer: A
