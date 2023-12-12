public class Cuadrado extends Poligono_Regular{
    double diagonal;

    public Cuadrado(String nombre) {
        super(nombre);
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void imprimirDiagonal() {
        diagonal = getLongutid_lado() * Math.sqrt(2);
        setDiagonal(diagonal);
        System.out.println("La diagonal del cuadrado es: " + getDiagonal());
    }

    @Override
    public void imprimirArea() {
        System.out.println("La area del cuadrado es: " + (getLongutid_lado() * getLongutid_lado()));
    }
}
