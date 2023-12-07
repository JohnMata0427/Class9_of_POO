public class Cuadrado extends Poligono_Regular{
    double diagonal;

    public Cuadrado(String nombre) {
        super(nombre);
    }

    private void setDiagonal(double diagonal) {
        diagonal = getLongutid_lado() * Math.sqrt(2);
        this.diagonal = diagonal;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void imprimirDiagonal() {
        System.out.println("La diagonal del cuadrado es: " + getDiagonal());
    }
}
