package asya_hoca_.Projects.Obeb_okek;

public class ObebOkek {
    private int a;
    private int b;

    public ObebOkek() {
    }

    public ObebOkek(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "ObebOkek{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
