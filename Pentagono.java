public class Pentagono extends Poligono_Regular{

    double angulo_central;

    public Pentagono(String nombre) {
        super(nombre);
    }

    private void setAngulo_central(double angulo_central) {
        angulo_central = 360 / getNum_lados();
        this.angulo_central = angulo_central;
    }

    public double getAngulo_central() {
        return angulo_central;
    }

    public void imprimirAngulo_central() {
        System.out.println("El angulo central del pentagono es: " + getAngulo_central());
    }
}