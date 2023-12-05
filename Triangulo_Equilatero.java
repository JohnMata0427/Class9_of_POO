public class Triangulo_Equilatero extends Regulares{

    double altura;

    public Triangulo_Equilatero(double lado, int lados) {
        super(lado, lados);
    }

    public void setAltura(double altura) {
        this.altura = lado * (Math.sqrt(3) / 2);
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return (getLado() * getAltura()) / 2;
    }

    public double getPerimeter() {
        return getLado() * getLados();
    }
}