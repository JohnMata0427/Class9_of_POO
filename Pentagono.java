public class Pentagono extends Poligono_Regular{

    double angulo_interno;

    public Pentagono(String nombre) {
        super(nombre);
    }

    private void setAngulo_interno(double angulo_interno) {
        angulo_interno = 360 / getNum_lados();
        this.angulo_interno = angulo_interno;
    }
}