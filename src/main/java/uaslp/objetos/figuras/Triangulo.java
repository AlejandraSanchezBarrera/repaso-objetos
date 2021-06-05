package uaslp.objetos.figuras;

public class Triangulo {
    private double base;
    private double altura;
    private double area;

    public Triangulo(double base, double altura) {
        this.base=base;
        this.altura=altura;
    }

    public Triangulo(){
        base=10;
        altura=3;
    }

    public void setBase(double base) {
        this.base=base;
    }

    public void setAltura(double altura) {
        this.altura=altura;
    }

    public double getArea() {
        area=(base*altura)/2;
        return area;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}