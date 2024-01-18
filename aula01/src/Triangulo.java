public class Triangulo {
    double ladoA;
    double ladoB;
    double ladoC;

    double area;
    public Triangulo(){

    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calcArea(){
        return (ladoA + ladoB + ladoC) / 2;
    }

}
