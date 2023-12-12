public class Pentagono extends Poligono_Regular{

    double angulo_central;

    public Pentagono(String nombre) {
        super(nombre);
    }

    public void setAngulo_central(double angulo_central) {
        this.angulo_central = angulo_central;
    }

    public double getAngulo_central() {
        return angulo_central;
    }

    public void imprimirAngulo_central() {
        angulo_central = 360 / getNum_lados();
        setAngulo_central(angulo_central);
        System.out.println("El angulo central del pentagono es: " + getAngulo_central());
    }

    @Override
    public void imprimirArea() {
        System.out.println("El area del pentagono es: " + (getPerimetro() * getApotema()) / 2);
    }

    @Override
    public void imprimirPerimetro() {
        System.out.println("El perimetro del pentagono es: " + getNum_lados() * getLongutid_lado());
    }
}